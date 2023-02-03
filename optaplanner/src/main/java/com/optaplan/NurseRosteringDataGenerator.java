package com.optaplan;

import java.util.ArrayList;
import java.util.List;

public class NurseRosteringDataGenerator{

        public static NurseRosteringSolution generate(int nurseCount, int shiftCount) {
            List<Shift> shifts = new ArrayList<>(shiftCount);
            for (int i = 0; i < shiftCount; i++) {
                shifts.add(new Shift());
            }

            List<Nurse> nurses = new ArrayList<>(nurseCount);
            for (int i = 0; i < nurseCount; i++) {
                nurses.add(new Nurse());
            }

            NurseRosteringSolution solution = new NurseRosteringSolution();
            solution.setShifts(shifts);
            solution.setNurses(nurses);
            return solution;
        }
}
