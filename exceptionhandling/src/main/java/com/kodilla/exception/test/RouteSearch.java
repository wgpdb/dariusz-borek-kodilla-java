package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteSearch {

    private final Map<String, Boolean> destinations = new HashMap<>();

    public Map<String, Boolean> destinationsMap() {

        destinations.put("WAW", true);
        destinations.put("KRK", false);
        destinations.put("GDN", false);
        destinations.put("FRA", true);
        destinations.put("LHR", true);
        destinations.put("CDG", true);

        return new HashMap<>(destinations);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (!destinationsMap().containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        } else if (destinationsMap().get(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() +
                    " is available");
        } else if (!destinationsMap().get(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() +
                    " is NOT available");
        }
    }
}