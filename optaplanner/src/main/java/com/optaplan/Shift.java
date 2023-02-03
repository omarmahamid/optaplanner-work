package com.optaplan;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Shift{

    private int id;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private int requiredNurseCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getRequiredNurseCount() {
        return requiredNurseCount;
    }

    public void setRequiredNurseCount(int requiredNurseCount) {
        this.requiredNurseCount = requiredNurseCount;
    }
}
