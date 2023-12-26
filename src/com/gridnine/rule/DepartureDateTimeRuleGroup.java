package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DepartureDateTimeRuleGroup implements DateTimeRuleGroup {


    @Override
    public List<Flight> doEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {

        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (localDateTime.isEqual(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doGreaterFiltration(List<Flight> flights, LocalDateTime dateTime) {

        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (localDateTime.isAfter(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doGreaterOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (localDateTime.isAfter(dateTime) || localDateTime.isEqual(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessFiltration(List<Flight> flights, LocalDateTime dateTime) {

        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (localDateTime.isBefore(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (localDateTime.isBefore(dateTime) || localDateTime.isEqual(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    @Override
    public List<Flight> doNotEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {

        List<Flight> result = new ArrayList<>();

        for (Flight fl: flights
        ) {
            LocalDateTime localDateTime = getFlightDepartureDateTime(fl.toString());
            if (!localDateTime.isEqual(dateTime)) {
                result.add(fl);
            }
        }
        return result;
    }

    private static LocalDateTime getFlightDepartureDateTime(String string){
        return LocalDateTime.parse(string.substring(1,17));
    }
}
