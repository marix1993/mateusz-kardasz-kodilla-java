package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightsDataBase {

    private Set<Flight> availableFlights;

    public FlightsDataBase(Set<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
