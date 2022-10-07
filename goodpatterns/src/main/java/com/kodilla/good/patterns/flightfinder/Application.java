package com.kodilla.good.patterns.flightfinder;

public class Application {

    public static void main(String[] args) {

        Destination destination = new Destination();
        FlightSearch flightSearch = new FlightSearch(destination.getDestinationsSet());

        flightSearch.showAllDestinations();
        flightSearch.showAllFlightsDepartureAirport("WAW");
        flightSearch.showAllFlightsDepartureAirport("POZ");
        flightSearch.showAllFlightsDestinationAirport("GDN");
        flightSearch.showFlightsToFrom("WAW", "KRK");
        flightSearch.showFlightsToFrom("WRO", "GDN");
        flightSearch.showFlightsToFrom("RZE", "POZ");
    }
}