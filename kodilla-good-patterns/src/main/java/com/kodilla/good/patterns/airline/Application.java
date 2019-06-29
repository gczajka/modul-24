package com.kodilla.good.patterns.airline;

public class Application {
    public static void main(String[] args) {
        FlightRequest request1 = new FlightRequest("aa", "none");
        FlightRequest request2 = new FlightRequest("none", "dd");
        FlightRequest request3 = new FlightRequest("aa", "bb");
        FlightRequest request4 = new FlightRequest("aa", "dd");
        FlightProcessor processor = new FlightProcessor( new FlightFinder(), new FlightRepository());
        processor.process(request1);
        processor.process(request2);
        processor.process(request3);
        processor.process(request4);
    }
}
