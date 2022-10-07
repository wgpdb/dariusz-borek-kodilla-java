package com.kodilla.good.patterns.flightfinder;

public class Airport {

    private final String airportCode;
    private final String city;

    public Airport(final String airportCode, final String city) {
        this.airportCode = airportCode;
        this.city = city;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return airportCode + " (" + city + ")";
    }
}