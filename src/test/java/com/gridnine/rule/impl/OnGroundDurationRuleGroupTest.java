package com.gridnine.rule.impl;

import com.gridnine.testing.Flight;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.constants.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnGroundDurationRuleGroupTest {

    private final OnGroundDurationRuleGroup out = new OnGroundDurationRuleGroup();

    @Test
    public void doEqualsFiltrationTest(){
        List<Flight> result = out.doEqualsFiltration(FLIGHT_LIST,ON_GROUND_DURATION_1_HOUR);
        assertEquals(FLIGHT_LIST_FOR_ON_GROUND_DURATION_EQUALS_TEST, result);
    }
    @Test
    public void doGreaterFiltrationTest(){
        List<Flight> result = out.doGreaterFiltration(FLIGHT_LIST,ON_GROUND_DURATION_1_HOUR);
        assertEquals(FLIGHT_LIST_FOR_ON_GROUND_DURATION_GREATER_TEST, result);
    }
    @Test
    public void doLessFiltrationTest(){
        List<Flight> result = out.doLessFiltration(FLIGHT_LIST,ON_GROUND_DURATION_1_HOUR);
        assertEquals(FLIGHT_LIST_FOR_ON_GROUND_DURATION_LESS_TEST, result);
    }

}
