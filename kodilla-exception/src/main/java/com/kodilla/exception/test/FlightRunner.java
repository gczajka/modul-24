package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        Flight fl = new Flight("Chopin","JFK");
        FlightFinder ff = new FlightFinder();
        try {
            ff.findFilght(fl);
        } catch (RouteNotFoundException e){
            System.out.println("Exception occurred. A flight to: " + fl.getArrivalAirport() + " is not in the offer.");
        }
    }
}
