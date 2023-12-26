package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.util.List;

public interface CountRuleGroup {

    List<Flight> doEqualsFiltration(List<Flight> flights, Integer duration);
    List<Flight> doGreaterFiltration(List<Flight> flights, Integer duration);
    List<Flight> doGreaterOoEqualsFiltration(List<Flight> flights, Integer duration);
    List<Flight> doLessFiltration(List<Flight> flights, Integer duration);
    List<Flight> doLessOrEqualsFiltration(List<Flight> flights, Integer duration);
    List<Flight> doNotEqualsFiltration(List<Flight> flights, Integer duration);

}
