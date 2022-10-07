package com.kodilla.good.patterns.flightfinder;

public class Flight {

    private final Airport departureAirport;
    private final Airport destinationAirport;

    public Flight(final Airport departureAirport, final Airport destinationAirport) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public String toString() {
        return departureAirport + " -> " + destinationAirport;
    }
}