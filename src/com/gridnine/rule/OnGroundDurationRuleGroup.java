package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.HOURS;

public class OnGroundDurationRuleGroup implements CountRuleGroup {


    @Override
    public List<Flight> doEqualsFiltration(List<Flight> flights, Integer duration) {

        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            if (getOnGroundDuration(fl.toString()) == duration) {
                result.add(fl);
            }
        }
        return result;

    }

    @Override
    public List<Flight> doGreaterFiltration(List<Flight> flights, Integer duration) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            if (getOnGroundDuration(fl.toString()) > duration) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doGreaterOoEqualsFiltration(List<Flight> flights, Integer duration) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            if (getOnGroundDuration(fl.toString()) >= duration) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessFiltration(List<Flight> flights, Integer duration) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            if (getOnGroundDuration(fl.toString()) < duration) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessOrEqualsFiltration(List<Flight> flights, Integer duration) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            System.out.println("getOnGroundDuration(fl.toString()) = " + getOnGroundDuration(fl.toString()));
            if (getOnGroundDuration(fl.toString()) <= duration) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doNotEqualsFiltration(List<Flight> flights, Integer duration) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            if (getOnGroundDuration(fl.toString()) != duration) {
                result.add(fl);
            }
        }
        return result;
    }

    private static int getOnGroundDuration(String string) {

        LocalDateTime arrival;
        LocalDateTime departure;
        int result = 0;

        if (getSegentsAmount(string) > 1) {

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if (ch == ' ') {
                    arrival = LocalDateTime.parse(string.substring(i-17,i-1)).truncatedTo(HOURS);
                    departure = LocalDateTime.parse(string.substring(i+2,i+18)).truncatedTo(HOURS);
                    result = result + (int)ChronoUnit.HOURS.between(arrival,departure);
                }
            }
            return result;
        } else
            return 0;
    }


    private static Long getSegentsAmount(String string) {
        return string.chars().filter(ch -> ch == ' ').count() + 1;
    }


}
