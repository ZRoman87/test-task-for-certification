package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface DateTimeRuleGroup {

    public List<Flight> doEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    public List<Flight> doGreaterFiltration(List<Flight> flights, LocalDateTime dateTime);
    public List<Flight> doGreaterOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    public List<Flight> doLessFiltration(List<Flight> flights, LocalDateTime dateTime);
    public List<Flight> doLessOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    public List<Flight> doNotEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);

}
