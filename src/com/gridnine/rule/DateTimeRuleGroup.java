package com.gridnine.rule;

import com.gridnine.testing.Flight;

import java.time.LocalDateTime;
import java.util.List;

public interface DateTimeRuleGroup {

    List<Flight> doEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    List<Flight> doGreaterFiltration(List<Flight> flights, LocalDateTime dateTime);
    List<Flight> doGreaterOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    List<Flight> doLessFiltration(List<Flight> flights, LocalDateTime dateTime);
    List<Flight> doLessOrEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);
    List<Flight> doNotEqualsFiltration(List<Flight> flights, LocalDateTime dateTime);

}
