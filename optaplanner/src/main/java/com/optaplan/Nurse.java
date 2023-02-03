package com.optaplan;

import java.util.List;

public class Nurse{

    private int id;
    private String name;
    private int maxWeeklyShifts;
    private List<Shift> availabilityList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxWeeklyShifts() {
        return maxWeeklyShifts;
    }

    public void setMaxWeeklyShifts(int maxWeeklyShifts) {
        this.maxWeeklyShifts = maxWeeklyShifts;
    }

    public List<Shift> getAvailabilityList() {
        return availabilityList;
    }

    public void setAvailabilityList(List<Shift> availabilityList) {
        this.availabilityList = availabilityList;
    }
}
