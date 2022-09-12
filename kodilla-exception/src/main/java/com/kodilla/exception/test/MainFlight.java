package com.kodilla.exception.test;

public class MainFlight {

    public static void main (String[]args){
        Flight LonManch = new Flight("London", "Manchester");
        Flight ManchOslot = new Flight ("Manchester", "Oslo");
        Flight ManchGlas = new Flight ("Manchester", "Glasgow");
        Flight OsloWar = new Flight ("Oslo", "Warsaw");

        FindingFlights findingFlights = new FindingFlights();

        try {
            boolean checkLonManch = findingFlights.findFlight(LonManch);
            System.out.println("Flight London - Manchester " + checkLonManch);
        } catch ( RouteNotFoundException e){
            System.out.println("Change airport name for the correct one.");
        }

        try {
            boolean checkManchOslot = findingFlights.findFlight(ManchOslot);
            System.out.println("Flight Manchester - Oslo " + checkManchOslot);
        } catch ( RouteNotFoundException e){
            System.out.println("Change airport name for the correct one.");
        }

        try {
            boolean checkManchGlas = findingFlights.findFlight(ManchGlas);
            System.out.println("Flight Manchester - Glasgow " + checkManchGlas);
        } catch ( RouteNotFoundException e){
            System.out.println("Change airport name for the correct one.");
        }

        try {
            boolean checkOsloWar = findingFlights.findFlight(OsloWar);
            System.out.println("Flight Oslo - Warsaw " + checkOsloWar);
        } catch ( RouteNotFoundException e){
            System.out.println("Change airport name for the correct one.");
        }
    }
}