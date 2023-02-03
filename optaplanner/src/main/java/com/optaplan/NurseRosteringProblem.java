package com.optaplan;

import org.optaplanner.core.api.score.Score;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;



public class NurseRosteringProblem{

    public static void main(String[] args) {
        NurseRosteringSolution problem = NurseRosteringDataGenerator.generate(20, 50);

        SolverFactory<NurseRosteringSolution> solverFactory =
                SolverFactory.createFromXmlResource("nurseRosteringSolverConfig.xml");

        Solver<NurseRosteringSolution> solver = solverFactory.buildSolver();

        NurseRosteringSolution solution = solver.solve(problem);

        Score bestScore = solution.getScore();
        System.out.println("Best score: " + bestScore);

        System.out.println("Shifts assigned to nurses:");
        for (Nurse nurse : solution.getNurses()) {
            System.out.println("Nurse " + nurse.getId() + ": " + nurse.getAvailabilityList());
        }
    }
}


