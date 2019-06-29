package com.kodilla.good.patterns.airline;

public class FlightRequest {
    String Departure;
    String Destination;

    public FlightRequest(String departure, String destination) {
        Departure = departure;
        Destination = destination;
    }

    public String getDeparture() {
        return Departure;
    }

    public String getDestination() {
        return Destination;
    }
}
