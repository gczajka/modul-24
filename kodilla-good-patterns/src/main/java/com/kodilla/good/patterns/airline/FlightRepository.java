package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightRepository {
    HashMap<String, ArrayList<Flight>> flightsByDeparture = new HashMap<String, ArrayList<Flight>>();
    HashMap<String, ArrayList<Flight>> flightsByDestination = new HashMap<String, ArrayList<Flight>>();

    public FlightRepository() {
        addFlight(new Flight("aa","bb", 1));
        addFlight(new Flight("cc","dd", 2));
        addFlight(new Flight("ee","ff", 3));
        addFlight(new Flight("bb","dd", 4));
        addFlight(new Flight("cc","ff", 5));
    }

    public void addFlight(Flight flight) {
        ArrayList<Flight> confirmationDep = flightsByDeparture.putIfAbsent(flight.getDeparture(), new ArrayList<Flight>());
        if(confirmationDep == null) {
            flightsByDeparture.get(flight.getDeparture()).add(flight);
        } else {
            confirmationDep.add(flight);
        }

        ArrayList<Flight> confirmationDest = flightsByDestination.putIfAbsent(flight.getDestination(), new ArrayList<Flight>());
        if(confirmationDest == null) {
            flightsByDestination.get(flight.getDestination()).add(flight);
        } else {
            confirmationDest.add(flight);
        }
    }

    public HashMap<String, ArrayList<Flight>> getFlightsByDeparture() {
        return flightsByDeparture;
    }

    public HashMap<String, ArrayList<Flight>> getFlightsByDestination() {
        return flightsByDestination;
    }
}
