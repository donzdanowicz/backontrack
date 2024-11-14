package com.backontrack.initialbasiccourse.list.linkedlist.clocks;

import java.time.LocalTime;

public class Clock {
    private final int number;
    private LocalTime time;

    public Clock(int number, int hour, int minute) {
        this.number = number;
        this.time = LocalTime.of(hour, minute);
    }

    public void setTime(int hour, int minute) {
        this.time = LocalTime.of(hour, minute);
    }

    public void addMinutes(int minutes) {
        int temporaryHours = (int) Math.floor((double) minutes / 60);
        int temporaryMinutes = minutes - temporaryHours * 60;

        if ((time.getMinute() + temporaryMinutes) > 59) {
            setTimeIfMinutesExceedOneHour(temporaryHours, temporaryMinutes);
        } else {
            setTimeIfMinutesDoNotExceedOneHour(temporaryHours, temporaryMinutes);
        }
    }

    private void setTimeIfMinutesExceedOneHour(int temporaryHours, int temporaryMinutes) {
        int minutesToSet = time.getMinute() + temporaryMinutes - 60;

        int correctedTemporaryHours = getCorrectedTemporaryHoursIfExceed24Hours(temporaryHours);
        correctedTemporaryHours++;
        int hoursToSet = time.getHour() + correctedTemporaryHours != 24 ? time.getHour() + correctedTemporaryHours : 0;

        this.time = LocalTime.of(hoursToSet, minutesToSet);
    }

    private void setTimeIfMinutesDoNotExceedOneHour(int temporaryHours, int temporaryMinutes) {
        int correctedTemporaryHours = getCorrectedTemporaryHoursIfExceed24Hours(temporaryHours);
        int hoursToSet = time.getHour() + correctedTemporaryHours != 24 ? time.getHour() + correctedTemporaryHours : 0;

        this.time = LocalTime.of(hoursToSet, time.getMinute() + temporaryMinutes);
    }

    private int getCorrectedTemporaryHoursIfExceed24Hours(int temporaryHours) {
        if (time.getHour() + temporaryHours > 24) {
            int multiplier = (time.getHour() + temporaryHours) / 24;
            temporaryHours = temporaryHours - multiplier * 24;
        }
        return temporaryHours;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getTime() {
        return time;
    }
}
