package com.gridnine;

import com.gridnine.filtration.Filter;
import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightBuilder;
import com.gridnine.util.CompareOperator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.MINUTES;

public class Main {
    public static void main(String[] args) {

        List<Flight> flights = FlightBuilder.createFlights();

        Filter filter = new Filter();

        List<Flight> filteredFlights;


        // Исключить вылеты до текущего момента времени

        System.out.println(" --- ИСКЛЮЧИТЬ ВЫЛЕТЫ ДО ТЕКУЩЕГО МОМЕНТА ВРЕМЕНИ --- ");
        filteredFlights = filter.doDepartureDateFiltration(flights, LocalDateTime.now().truncatedTo(MINUTES), CompareOperator.GREATER);
        System.out.println("filteredFlights = " + filteredFlights);

        // ИСключить вылеты с сегментами с датой прилёта раньше даты вылета

        System.out.println(" --- ИСКЛЮЧИТЬ ВЫЛЕТЫ С СЕГМЕНТАМИ С ДАТОЙ ПРИЛЕТА РАНЬШЕ ДАТЫ ВЫЛЕТА --- ");
        filteredFlights = filter.doArrivalDateFiltration(flights, LocalDateTime.now().truncatedTo(MINUTES), CompareOperator.GREATER);
        System.out.println("filteredFlights = " + filteredFlights);

        // Перелеты, где общее время, проведённое на земле, превышает два часа
        System.out.println(" --- ИСКЛЮЧИТЬ ПЕРЕЛЕТЫ, ГДЕ ОБЩЕЕ ВРЕМЯ, ПРОВЕДЕННОЕ НА ЗЕМЛЕ, ПРЕВЫШАЕТ 2 ЧАСА --- ");
        filteredFlights = filter.doOnGroundDurationFiltration(flights, 2, CompareOperator.LESS_OR_EQUALS);
        System.out.println("filteredFlights = " + filteredFlights);


        //--------------------------------------------------------------------------------------------------------------------------------------

        /*
        System.out.println("flights.get(0) = \n" + flights.get(0));
        System.out.println("flights.get(1) = \n" + flights.get(1));
        System.out.println("flights.get(2) = \n" + flights.get(2));
        System.out.println("flights.get(3) = \n" + flights.get(3));
        System.out.println("flights.get(4) = \n" + flights.get(4));
        System.out.println("flights.get(5) = \n" + flights.get(5));

        System.out.println("flights = \n" + flights);


        System.out.println("--- ArrivalDateFiltration ---");
        LocalDateTime time = LocalDateTime.now().plusDays(3).plusHours(6).truncatedTo(MINUTES);
        System.out.println("time = " + time);

        filteredFlights = filter.doArrivalDateFiltration(flights,time, CompareOperator.EQUALS);
        System.out.println("filteredFlights: ArrivalDateEQUALS = " + filteredFlights);

        filteredFlights = filter.doArrivalDateFiltration(flights,time, CompareOperator.GREATER);
        System.out.println("filteredFlights: ArrivalDateGREATER = " + filteredFlights);

        filteredFlights = filter.doArrivalDateFiltration(flights,time, CompareOperator.LESS);
        System.out.println("filteredFlights: ArrivalDateLESS = " + filteredFlights);

        filteredFlights = filter.doArrivalDateFiltration(flights,time, CompareOperator.NOT_EQUALS);
        System.out.println("filteredFlights: ArrivalDateNOT_EQULAS = " + filteredFlights);


        System.out.println("--- DepartureDateFiltration ---");

        time = LocalDateTime.now().plusDays(3).truncatedTo(MINUTES);
        System.out.println("time = " + time);

        filteredFlights = filter.doDepartureDateFiltration(flights,time, CompareOperator.EQUALS);
        System.out.println("filteredFlights: DepartureDateEQUALS = " + filteredFlights);

        filteredFlights = filter.doDepartureDateFiltration(flights,time, CompareOperator.GREATER);
        System.out.println("filteredFlights: DepartureDateGREATER = " + filteredFlights);

        filteredFlights = filter.doDepartureDateFiltration(flights,time, CompareOperator.LESS);
        System.out.println("filteredFlights: DepartureDateLESS = " + filteredFlights);

        filteredFlights = filter.doDepartureDateFiltration(flights,time, CompareOperator.NOT_EQUALS);
        System.out.println("filteredFlights: DepartureDateNOT_EQUALS = " + filteredFlights);


        System.out.println("--- SegmentDateFiltration ---");

        filteredFlights = filter.doSegmentDateFiltration(flights, CompareOperator.EQUALS);
        System.out.println("filteredFlights: SegmentDateEQUALS = " + filteredFlights);

        filteredFlights = filter.doSegmentDateFiltration(flights, CompareOperator.GREATER);
        System.out.println("filteredFlights: SegmentDateGREATER = " + filteredFlights);

        filteredFlights = filter.doSegmentDateFiltration(flights, CompareOperator.LESS);
        System.out.println("filteredFlights: SegmentDateLESS = " + filteredFlights);

        filteredFlights = filter.doSegmentDateFiltration(flights, CompareOperator.NOT_EQUALS);
        System.out.println("filteredFlights: SegmentDateNOT_EQUALS = " + filteredFlights);


        System.out.println("--- OnGroundDurationFiltration ---");

        int duration = 2;
        System.out.println("duration = " + duration);

        filteredFlights = filter.doOnGroundDurationFiltration(flights, duration, CompareOperator.EQUALS);
        System.out.println("filteredFlights: OnGroundDurationEQUALS = " + filteredFlights);

        filteredFlights = filter.doOnGroundDurationFiltration(flights, duration, CompareOperator.GREATER);
        System.out.println("filteredFlights: OnGroundDurationGREATER = " + filteredFlights);

        filteredFlights = filter.doOnGroundDurationFiltration(flights, duration, CompareOperator.LESS);
        System.out.println("filteredFlights: OnGroundDurationLESS = " + filteredFlights);

        filteredFlights = filter.doOnGroundDurationFiltration(flights, duration, CompareOperator.LESS_OR_EQUALS);
        System.out.println("filteredFlights: OnGroundDurationLESS_OR_EQUALS = " + filteredFlights);

        filteredFlights = filter.doOnGroundDurationFiltration(flights, duration, CompareOperator.NOT_EQUALS);
        System.out.println("filteredFlights: OnGroundDurationNOT_EQUALS = " + filteredFlights);
*/
    }
}