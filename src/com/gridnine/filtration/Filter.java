package com.gridnine.filtration;
import com.gridnine.rule.*;
import com.gridnine.testing.Flight;
import com.gridnine.util.CompareOperator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Filter {


    public List<Flight> doArrivalDateFiltration(List<Flight> flights, LocalDateTime dateTime, CompareOperator comparator){

        DateTimeRuleGroup dateTimeRuleGroup = new ArrivalDateTimeRuleGroup();
        return doFiltration(flights, dateTimeRuleGroup, dateTime, comparator);

    }

    public List<Flight> doDepartureDateFiltration(List<Flight> flights, LocalDateTime dateTime, CompareOperator comparator){

        DateTimeRuleGroup dateTimeRuleGroup = new DepartureDateTimeRuleGroup();
        return doFiltration(flights, dateTimeRuleGroup, dateTime, comparator);

    }

    public List<Flight> doSegmentDateFiltration(List<Flight> flights, CompareOperator comparator){

        DateTimeRuleGroup dateTimeRuleGroup = new SegmentDateTimeRuleGroup();
        return doFiltration(flights, dateTimeRuleGroup, comparator);

    }

    public List<Flight> doOnGroundDurationFiltration(List<Flight> flights, Integer duration, CompareOperator comparator){

        CountRuleGroup countRuleGroup = new OnGroundDurationRuleGroup();
        return doFiltration(flights, countRuleGroup, duration, comparator);

    }

private static List<Flight>  doFiltration(List<Flight> flights, DateTimeRuleGroup dateTimeRuleGroup, LocalDateTime dateTime, CompareOperator comparator){

    List<Flight> result = new ArrayList<>();

    switch (comparator) {
        case EQUALS:
            result = dateTimeRuleGroup.doEqualsFiltration(flights,dateTime);
            break;
        case GREATER:
            result = dateTimeRuleGroup.doGreaterFiltration(flights,dateTime);
            break;
        case GREATER_OR_EQUALS:
            result = dateTimeRuleGroup.doGreaterFiltration(flights,dateTime);
            break;
        case LESS:
            result = dateTimeRuleGroup.doLessFiltration(flights,dateTime);
            break;
        case LESS_OR_EQUALS:
            result = dateTimeRuleGroup.doLessFiltration(flights,dateTime);
            break;
        case NOT_EQUALS:
            result = dateTimeRuleGroup.doNotEqualsFiltration(flights,dateTime);
            break;
    }
    return result;
}
    private static List<Flight>  doFiltration(List<Flight> flights, DateTimeRuleGroup dateTimeRuleGroup, CompareOperator comparator){

        List<Flight> result = new ArrayList<>();

        switch (comparator) {
            case EQUALS:
                result = dateTimeRuleGroup.doEqualsFiltration(flights, null);
                break;
            case GREATER:
                result = dateTimeRuleGroup.doGreaterFiltration(flights, null);
                break;
            case GREATER_OR_EQUALS:
                result = dateTimeRuleGroup.doGreaterFiltration(flights, null);
                break;
            case LESS:
                result = dateTimeRuleGroup.doLessFiltration(flights, null);
                break;
            case LESS_OR_EQUALS:
                result = dateTimeRuleGroup.doLessFiltration(flights, null);
                break;
            case NOT_EQUALS:
                result = dateTimeRuleGroup.doNotEqualsFiltration(flights,null);
                break;
        }
        return result;
    }

    private static List<Flight>  doFiltration(List<Flight> flights, CountRuleGroup countRuleGroup, Integer duration, CompareOperator comparator) {

        List<Flight> result = new ArrayList<>();

        switch (comparator) {
            case EQUALS:
                result = countRuleGroup.doEqualsFiltration(flights, duration);
                break;
            case GREATER:
                result = countRuleGroup.doGreaterFiltration(flights, duration);
                break;
            case GREATER_OR_EQUALS:
                result = countRuleGroup.doGreaterFiltration(flights, duration);
                break;
            case LESS:
                result = countRuleGroup.doLessFiltration(flights, duration);
                break;
            case LESS_OR_EQUALS:
                result = countRuleGroup.doLessFiltration(flights, duration);
                break;
            case NOT_EQUALS:
                result = countRuleGroup.doNotEqualsFiltration(flights, duration);
                break;
        }
        return result;
    }
}
