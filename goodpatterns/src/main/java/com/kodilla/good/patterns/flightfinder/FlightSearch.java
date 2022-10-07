package com.kodilla.good.patterns.flightfinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {

    private final Set<Flight> destinationsSet;

    public FlightSearch(Set<Flight> destinationsSet) {
        this.destinationsSet = destinationsSet;
    }

    public void showAllDestinations() {
        System.out.println("All destinations:");
        destinationsSet.stream()
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void showAllFlightsDepartureAirport(String airportCode) {
        System.out.println("All flights from " + airportCode + ":");
        destinationsSet.stream()
                .filter(s -> s.getDepartureAirport().getAirportCode().equals(airportCode))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void showAllFlightsDestinationAirport(String airportCode) {
        System.out.println("All flights to " + airportCode + ":");
        destinationsSet.stream()
                .filter(s -> s.getDestinationAirport().getAirportCode().equals(airportCode))
                .map(Flight::toString)
                .forEach(System.out::println);
    }

    public void showFlightsToFrom(String departureAirportCode, String arrivalAirportCode) {

        List<String> directFlight = new ArrayList<>();
        List<Flight> indirectFlightLegOne = new ArrayList<>();
        List<Flight> indirectFlightLegTwo = new ArrayList<>();

        destinationsSet.stream()
                .filter(s -> s.getDepartureAirport().getAirportCode().equals(departureAirportCode))
                .filter(s -> s.getDestinationAirport().getAirportCode().equals(arrivalAirportCode))
                .map(Flight::toString)
                .collect(Collectors.toCollection(() -> directFlight));

        destinationsSet.stream()
                .filter(s -> s.getDepartureAirport().getAirportCode().equals(departureAirportCode))
                .collect(Collectors.toCollection(() -> indirectFlightLegOne));

        for (Flight via : indirectFlightLegOne) {
            destinationsSet.stream()
                    .filter(s -> s.getDepartureAirport().equals(via.getDestinationAirport()))
                    .filter(s -> s.getDestinationAirport().getAirportCode().equals(arrivalAirportCode))
                    .collect(Collectors.toCollection(() -> indirectFlightLegTwo));
        }

        if (directFlight.size() != 0) {
            System.out.println("Flights from " + departureAirportCode + " to " + arrivalAirportCode + ":");
            System.out.println(directFlight);
        } else {
            System.out.println("Sorry, NO direct flights available from " + departureAirportCode +
                    " to " + arrivalAirportCode);

            if (indirectFlightLegOne.size() != 0 || indirectFlightLegTwo.size() != 0) {
                System.out.println("Available indirect flights from " + departureAirportCode + " to " +
                        arrivalAirportCode + ":");
                System.out.println(indirectFlightLegOne);
                System.out.println(indirectFlightLegTwo);
            } else {
                System.out.println("Sorry, NO indirect flights available from " + departureAirportCode +
                        " to " + arrivalAirportCode);
            }
        }
    }
}