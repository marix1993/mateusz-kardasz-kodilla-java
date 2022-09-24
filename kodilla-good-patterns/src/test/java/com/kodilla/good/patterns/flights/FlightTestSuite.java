package com.kodilla.good.patterns.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FlightTestSuite {
    private FlightsServ flightsServ;
    private FlightsDataBase flightsDataBaseMock;
    private Set<Flight> availableFlights;

    @BeforeEach
    public void beforeClass() {
        flightsDataBaseMock = mock(FlightsDataBase.class);
        flightsServ = new FlightsServ(flightsDataBaseMock);
        availableFlights = new HashSet<>();
        availableFlights.add(new Flight("WRO", "WAR"));
        availableFlights.add(new Flight("WAR", "GDA"));
        availableFlights.add(new Flight("WRO", "NYC"));
        availableFlights.add(new Flight("GDA", "NYC"));
        availableFlights.add(new Flight("WAR", "NYC"));
        availableFlights.add(new Flight("WRO", "GDA"));
    }

    @Test
    public void availableFlightsFromTest() {
        //Given
        String flightFrom = "WRO";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO", "WAR"));
        expected.add(new Flight("WRO", "NYC"));
        expected.add(new Flight("WRO", "GDA"));
        //When
        when(flightsDataBaseMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsServ.availFlightsFrom(flightFrom);
        //Then
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void availableFlightsToTest() {
        //Given
        String flightTo = "NYC";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO", "NYC"));
        expected.add(new Flight("GDA", "NYC"));
        expected.add(new Flight("WAR", "NYC"));
        //When
        when(flightsDataBaseMock.getAvailableFlights()).thenReturn(availableFlights);
        Set<Flight> result = flightsServ.availFlightsTo(flightTo);
        //Then
        Assertions.assertEquals(expected, result);
    }
}
