package com.kodilla.good.patterns.airline;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlight(FlightRepository repository, FlightRequest request) {
        if(request.getDeparture() != "none" && request.getDestination() != "none") {
            if(!repository.getFlightsByDeparture().keySet().contains(request.getDeparture()) || !repository.getFlightsByDestination().keySet().contains(request.getDestination())) {
                System.out.println("Unable to find a suitable flight");
            } else {
                ArrayList<Flight> list = repository.getFlightsByDeparture().get(request.getDeparture());
                Flight flightSearchedFor = null;
                for (Flight flight: list) {
                    if(flight.getDestination().equals(request.getDestination())) {
                        flightSearchedFor = flight;
                    }
                }
                if(flightSearchedFor != null) {
                    System.out.println("Flight number: " + flightSearchedFor.getFlightNumber() + " suits the requirements");
                } else {
                    List<String> firstFlightDestinationsList = repository.getFlightsByDeparture().get(request.getDeparture()).stream()
                            .map(e -> e.getDestination())
                            .collect(Collectors.toList());
                    List<Flight> secondFlightList = repository.getFlightsByDestination().get(request.getDestination()).stream()
                            .filter(e -> firstFlightDestinationsList.contains(e.getDeparture()))
                            .collect(Collectors.toList());
                    if(secondFlightList.size() == 0) {
                        System.out.println("Unable to find a suitable flight");
                    } else {
                        List<String> secondFlightDeparturesList = secondFlightList.stream()
                                .map(e -> e.getDeparture())
                                .collect(Collectors.toList());
                        List<Flight> firstFlightList = repository.getFlightsByDeparture().get(request.getDeparture()).stream()
                                .filter(e -> secondFlightDeparturesList.contains(e.getDestination()))
                                .collect(Collectors.toList());
                        HashMap<Flight, Flight> transferCombinations = new HashMap<Flight, Flight>();
                        for(Flight flight: firstFlightList) {
                            transferCombinations.put(flight, secondFlightList.get(getIndexOfListElementContainingSoughtAttribute(flight, secondFlightList)));
                        }
                        System.out.println("Following combinations of flights suit the requirements: ");
                        Set<Map.Entry<Flight, Flight>> setOFCombinations = transferCombinations.entrySet();
                        for(Map.Entry<Flight, Flight> entry: setOFCombinations) {
                            System.out.println(entry);
                        }
                    }
                }
            }
        } else if(request.getDeparture() != "none" && request.getDestination() == "none") {
            ArrayList<Flight> depList = repository.getFlightsByDeparture().get(request.getDeparture());
            System.out.println("Following flights are available from " + request.getDeparture() + " : ");
            for (Flight flight: depList) {
                System.out.println("number " + flight.getFlightNumber() + " to " + flight.getDestination());
            }
        } else if (request.getDeparture() == "none" && request.getDestination() != "none") {
            ArrayList<Flight> destList = repository.getFlightsByDestination().get(request.getDestination());
            System.out.println("Following flights are available to " + request.getDestination() + " : ");
            for (Flight flight: destList) {
                System.out.println("number " + flight.getFlightNumber() + " from " + flight.getDeparture());
            }
        }
    }

    public int getIndexOfListElementContainingSoughtAttribute(Flight seeker, List<Flight> list) {
        Flight sought = null;
        for(Flight flight: list) {
            if(flight.getDeparture() == seeker.getDestination()) {
                sought = flight;
            }
        }
        return list.indexOf(sought);
    }
}
