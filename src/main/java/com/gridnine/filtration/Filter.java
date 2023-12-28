package com.gridnine.filtration;
import com.gridnine.rule.*;
import com.gridnine.rule.impl.ArrivalDateTimeRuleGroup;
import com.gridnine.rule.impl.DepartureDateTimeRuleGroup;
import com.gridnine.rule.impl.OnGroundDurationRuleGroup;
import com.gridnine.rule.impl.SegmentDateTimeRuleGroup;
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

        SegmentRuleGroup segmentRuleGroup = new SegmentDateTimeRuleGroup();
        return doFiltration(flights, segmentRuleGroup, comparator);

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
    private static List<Flight>  doFiltration(List<Flight> flights, SegmentRuleGroup segmentRuleGroup, CompareOperator comparator){

        List<Flight> result = new ArrayList<>();

        switch (comparator) {
            case EQUALS:
                result = segmentRuleGroup.doEqualsFiltration(flights);
                break;
            case GREATER:
                result = segmentRuleGroup.doGreaterFiltration(flights);
                break;
            case GREATER_OR_EQUALS:
                result = segmentRuleGroup.doGreaterFiltration(flights);
                break;
            case LESS:
                result = segmentRuleGroup.doLessFiltration(flights);
                break;
            case LESS_OR_EQUALS:
                result = segmentRuleGroup.doLessFiltration(flights);
                break;
            case NOT_EQUALS:
                result = segmentRuleGroup.doNotEqualsFiltration(flights);
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
