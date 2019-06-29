package com.kodilla.good.patterns.airline;

public class FlightProcessor {
    FlightFinder finder;
    FlightRepository repository;

    public FlightProcessor(FlightFinder finder, FlightRepository repository) {
        this.finder = finder;
        this.repository = repository;
    }

    public void process(FlightRequest request) {
        finder.findFlight(repository, request);
    }
}
