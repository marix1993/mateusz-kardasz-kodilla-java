package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightsServ {

    private FlightsDataBase flightsDataBase;

    public FlightsServ(FlightsDataBase flightsDataBase) {
        this.flightsDataBase = flightsDataBase;
    }

    public Set<Flight> availFlightsFrom(String flightFrom) {
        return flightsDataBase.getAvailableFlights().stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availFlightsTo(String flightTo) {
        return flightsDataBase.getAvailableFlights().stream()
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> availableConnectingFlights(String flightFrom, String flightTo) {
        Set<List<Flight>> setOfFlights = new HashSet<>();

        flightsDataBase.getAvailableFlights().stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .forEach(flight -> {
                    List <Flight> temp = flightsDataBase.getAvailableFlights().stream()
                            .filter(fl -> (flight.getFlightTo().equals(fl.getFlightFrom()) && fl.getFlightTo().equals(flightTo)))
                            .collect(Collectors.toList());

                    if (temp.size() > 0) {
                        List<Flight> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(temp);
                        setOfFlights.add(flightsRoute);
                    }
                });
        return setOfFlights;
    }
}
