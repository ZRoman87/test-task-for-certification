package com.gridnine.constants;

import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightBuilder;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.temporal.ChronoUnit.MINUTES;

public class TestConstants {

    public static final LocalDateTime DATE_TIME_3_DAYS_FROM_NOW = LocalDateTime.now().plusDays(3).truncatedTo(MINUTES);
    public static final LocalDateTime DATE_TIME_2_DAYS_FROM_NOW = LocalDateTime.now().plusDays(2).truncatedTo(MINUTES);
    public static final LocalDateTime DATE_TIME_NOW = LocalDateTime.now().truncatedTo(MINUTES);
    public static final int ON_GROUND_DURATION_1_HOUR = 1;
    public final static List<Flight> FLIGHT_LIST = FlightBuilder.createFlights();
    public static final Flight FLIGHT_0_DEP_EQUALS_ARR = FLIGHT_LIST.get(0);;
    public static final Flight FLIGHT_1_FLIGHT_2H = FLIGHT_LIST.get(1);
    public static final Flight FLIGHT_2_FLIGHT_2H_1HGROUND_2H = FLIGHT_LIST.get(2);
    public static final Flight FLIGHT_3_DEP_IN_PAST = FLIGHT_LIST.get(3);
    public static final Flight FLIGHT_4_DEP_BEFORE_ARR = FLIGHT_LIST.get(4);
    public static final Flight FLIGHT_5_MORE_2H_GROUND_SEGM = FLIGHT_LIST.get(5);
    public static final Flight FLIGHT_6_MORE_2H_GROUND_3SEGM = FLIGHT_LIST.get(6);

    public final static List<Flight> FLIGHT_LIST_FOR_ARRIVAL_DATE_TIME_EQUALS_TEST = List.of(
            FLIGHT_0_DEP_EQUALS_ARR,
            FLIGHT_3_DEP_IN_PAST
    );

    public final static List<Flight> FLIGHT_LIST_FOR_ARRIVAL_DATE_TIME_GREATER_TEST = List.of(
            FLIGHT_1_FLIGHT_2H,
            FLIGHT_2_FLIGHT_2H_1HGROUND_2H,
            FLIGHT_5_MORE_2H_GROUND_SEGM,
            FLIGHT_6_MORE_2H_GROUND_3SEGM
    );

    public final static List<Flight> FLIGHT_LIST_FOR_ARRIVAL_DATE_TIME_LESS_TEST = List.of(
            FLIGHT_4_DEP_BEFORE_ARR
    );

    public final static List<Flight> FLIGHT_LIST_FOR_DEPARTURE_DATE_TIME_EQUALS_TEST = List.of(
            FLIGHT_0_DEP_EQUALS_ARR,
            FLIGHT_1_FLIGHT_2H,
            FLIGHT_2_FLIGHT_2H_1HGROUND_2H,
            FLIGHT_4_DEP_BEFORE_ARR,
            FLIGHT_5_MORE_2H_GROUND_SEGM,
            FLIGHT_6_MORE_2H_GROUND_3SEGM
    );

    public final static List<Flight> FLIGHT_LIST_FOR_DEPARTURE_DATE_TIME_GREATER_TEST = List.of(
    );

    public final static List<Flight> FLIGHT_LIST_FOR_DEPARTURE_DATE_TIME_LESS_TEST = List.of(
            FLIGHT_3_DEP_IN_PAST
    );

    public final static List<Flight> FLIGHT_LIST_FOR_ON_GROUND_DURATION_EQUALS_TEST = List.of(
            FLIGHT_2_FLIGHT_2H_1HGROUND_2H
    );

    public final static List<Flight> FLIGHT_LIST_FOR_ON_GROUND_DURATION_GREATER_TEST = List.of(
            FLIGHT_5_MORE_2H_GROUND_SEGM,
            FLIGHT_6_MORE_2H_GROUND_3SEGM
    );

    public final static List<Flight> FLIGHT_LIST_FOR_ON_GROUND_DURATION_LESS_TEST = List.of(
            FLIGHT_0_DEP_EQUALS_ARR,
            FLIGHT_1_FLIGHT_2H,
            FLIGHT_3_DEP_IN_PAST,
            FLIGHT_4_DEP_BEFORE_ARR
    );

    public final static List<Flight> FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_EQUALS_TEST = List.of(
            FLIGHT_0_DEP_EQUALS_ARR
    );

    public final static List<Flight> FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_GREATER_TEST = List.of(
            FLIGHT_4_DEP_BEFORE_ARR
    );

    public final static List<Flight> FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_LESS_TEST = List.of(
            FLIGHT_1_FLIGHT_2H,
            FLIGHT_2_FLIGHT_2H_1HGROUND_2H,
            FLIGHT_3_DEP_IN_PAST,
            FLIGHT_5_MORE_2H_GROUND_SEGM,
            FLIGHT_6_MORE_2H_GROUND_3SEGM
    );

/*
            FLIGHT_0_DEP_EQUALS_ARR,
            FLIGHT_1_FLIGHT_2H,
            FLIGHT_2_FLIGHT_2H_1HGROUND_2H,
            FLIGHT_3_DEP_IN_PAST,
            FLIGHT_4_DEP_BEFORE_ARR,
            FLIGHT_5_MORE_2H_GROUND_SEGM,
            FLIGHT_6_MORE_2H_GROUND_3SEGM



    * */




}
