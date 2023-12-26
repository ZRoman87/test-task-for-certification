package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface CountRuleGroup {

    public List<Flight> doEqualsFiltration(List<Flight> flights, Integer duration);
    public List<Flight> doGreaterFiltration(List<Flight> flights, Integer duration);
    public List<Flight> doGreaterOoEqualsFiltration(List<Flight> flights, Integer duration);
    public List<Flight> doLessFiltration(List<Flight> flights, Integer duration);
    public List<Flight> doLessOrEqualsFiltration(List<Flight> flights, Integer duration);
    public List<Flight> doNotEqualsFiltration(List<Flight> flights, Integer duration);

}
