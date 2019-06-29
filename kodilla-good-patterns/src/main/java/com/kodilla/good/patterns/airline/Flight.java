package com.kodilla.good.patterns.airline;

import java.util.Objects;

public class Flight {
    String Departure;
    String Destination;
    int flightNumber;

    public Flight(String departure, String destination, int flightNumber) {
        Departure = departure;
        Destination = destination;
        this.flightNumber = flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightNumber() == flight.getFlightNumber() &&
                getDeparture().equals(flight.getDeparture()) &&
                getDestination().equals(flight.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture(), getDestination(), getFlightNumber());
    }

    public String getDeparture() {
        return Departure;
    }

    public String getDestination() {
        return Destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight number: " + flightNumber + "{" +
                "Departure='" + Departure + '\'' +
                ", Destination='" + Destination + '\'' +
                '}';
    }
}
