package com.kodilla.good.patterns.flights;

public class Flight {

    private String FlightFrom;
    private String FlightTo;

    public Flight(String flightFrom, String flightTo) {
        FlightFrom = flightFrom;
        FlightTo = flightTo;
    }

    public String getFlightFrom() {
        return FlightFrom;
    }

    public String getFlightTo() {
        return FlightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!FlightFrom.equals(flight.FlightFrom)) return false;
        return FlightTo.equals(flight.FlightTo);
    }

    @Override
    public int hashCode() {
        int result = FlightFrom.hashCode();
        result = 31 * result + FlightTo.hashCode();
        return result;
    }
}
