package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.util.List;

public interface SegmentRuleGroup {

    List<Flight> doEqualsFiltration(List<Flight> flights);
    List<Flight> doGreaterFiltration(List<Flight> flights);
    List<Flight> doGreaterOrEqualsFiltration(List<Flight> flights);
    List<Flight> doLessFiltration(List<Flight> flights);
    List<Flight> doLessOrEqualsFiltration(List<Flight> flights);
    List<Flight> doNotEqualsFiltration(List<Flight> flights);

}
