package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegmentDateTimeRuleGroup implements DateTimeRuleGroup {


    @Override
    public List<Flight> doEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {

        List<Flight> result = new ArrayList<>();
        List<String> segments;

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
                 ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (SegmentDepartureDateTime.isEqual(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Flight> doGreaterFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();
        List<String> segments;

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
            ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (SegmentDepartureDateTime.isAfter(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Flight> doGreaterOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();
        List<String> segments;

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
            ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (SegmentDepartureDateTime.isAfter(SegmentArrivalDateTime) || SegmentDepartureDateTime.isEqual(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();
        List<String> segments;

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
            ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (SegmentDepartureDateTime.isBefore(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Flight> doLessOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();
        List<String> segments;

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
            ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (SegmentDepartureDateTime.isBefore(SegmentArrivalDateTime) || SegmentDepartureDateTime.isEqual(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public List<Flight> doNotEqualsFiltration(List<Flight> flights, LocalDateTime dateTime) {
        List<Flight> result = new ArrayList<>();
        List<String> segments = new ArrayList<>();

        for (Flight fl: flights
        ) {
            segments = getSegmentsFromFlight(fl.toString());

            for (String s: segments
            ) {
                LocalDateTime SegmentDepartureDateTime = getSegmentDepartureDateTime(s);
                LocalDateTime SegmentArrivalDateTime = getSegmentArrivalDateTime(s);

                if (!SegmentDepartureDateTime.isEqual(SegmentArrivalDateTime)) {
                    result.add(fl);
                    break;
                }
            }
        }
        return result;
    }

    private static LocalDateTime getSegmentArrivalDateTime(String string){
        return LocalDateTime.parse(string.substring(string.length()-17,string.length()-1));
    }

    private static LocalDateTime getSegmentDepartureDateTime(String string){
        return LocalDateTime.parse(string.substring(1,17));
    }

    private static List<String> getSegmentsFromFlight(String string){
        return Arrays.asList(string.split(" ", -1));
    }


}
