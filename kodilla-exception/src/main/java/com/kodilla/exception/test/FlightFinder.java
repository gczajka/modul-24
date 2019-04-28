package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> airportMap = new HashMap<>();

    public void findFilght(Flight flight)throws RouteNotFoundException{
        String airport = flight.getArrivalAirport();
        boolean destinationAvailability = airportMap.containsKey(airport);
        if(destinationAvailability){
            boolean flightAvailability = airportMap.get(airport);
            if(flightAvailability){
                System.out.println("A flight to: " + airport + " is currently available.");
            } else {
                System.out.println("A flight to: " + airport + " is currently not available.");
            }
        } else {
            throw new RouteNotFoundException();
        }
    }

    public void addAirport(String airport, Boolean validity){
        airportMap.put(airport,validity);
    }
}
