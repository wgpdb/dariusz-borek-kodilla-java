package com.kodilla.exception.test;

public class RouteSearchRunner {

    public static void main(String[] args) {

        Flight flightFraWaw = new Flight("FRA", "WAW");
        Flight flightLhrKrk = new Flight("LHR", "KRK");
        Flight flightWawAms = new Flight("WAW", "AMS");

        RouteSearch routeSearch = new RouteSearch();

        try {
            routeSearch.findFlight(flightFraWaw);
            routeSearch.findFlight(flightLhrKrk);
            routeSearch.findFlight(flightWawAms);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found or airport code not valid " + e);
        } finally {
            System.out.println("end");
        }
    }
}