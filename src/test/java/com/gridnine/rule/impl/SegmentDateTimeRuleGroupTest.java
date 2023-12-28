package com.gridnine.rule.impl;

import com.gridnine.testing.Flight;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.constants.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegmentDateTimeRuleGroupTest {

    private final SegmentDateTimeRuleGroup out = new SegmentDateTimeRuleGroup();

    @Test
    public void doEqualsFiltrationTest(){
        List<Flight> result = out.doEqualsFiltration(FLIGHT_LIST);
        assertEquals(FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_EQUALS_TEST, result);
    }
    @Test
    public void doGreaterFiltrationTest(){
        List<Flight> result = out.doGreaterFiltration(FLIGHT_LIST);
        assertEquals(FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_GREATER_TEST, result);
    }
    @Test
    public void doLessFiltrationTest(){
        List<Flight> result = out.doLessFiltration(FLIGHT_LIST);
        assertEquals(FLIGHT_LIST_FOR_SEGMENT_DATE_TIME_LESS_TEST, result);
    }

}
