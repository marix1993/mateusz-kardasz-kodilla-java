package com.kodilla.exception.test;

import java.util.*;

public class FindingFlights {

    private final Map<String, Boolean> airportMap;
    public FindingFlights() {
        airportMap = airportDataBase();
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("London", true);
        airportDataBase.put("Manchester", true);
        airportDataBase.put("Milan", false);
        airportDataBase.put("Berlin", false);
        airportDataBase.put("Oslo", true);
        airportDataBase.put("Warsaw", false);

        return airportDataBase;
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException {
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        } else {
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }
}