package com.kodilla.good.patterns.flightfinder;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Destination {

    private Set<Flight> destinationsSet = new HashSet<>();

    Airport waw = new Airport("WAW", "Warszawa");
    Airport gdn = new Airport("GDN", "Gdansk");
    Airport poz = new Airport("POZ", "Poznan");
    Airport wro = new Airport("WRO", "Wroclaw");
    Airport krk = new Airport("KRK", "Krakow");

    Flight wawGdn = new Flight(waw, gdn);
    Flight wawPoz = new Flight(waw, poz);
    Flight wawWro = new Flight(waw, wro);
    Flight wawKrk = new Flight(waw, krk);
    Flight gdnWaw = new Flight(gdn, waw);
    Flight pozWaw = new Flight(poz, waw);
    Flight wroWaw = new Flight(wro, waw);
    Flight krkWaw = new Flight(krk, waw);

    private Set<Flight> destinationsSet() {

        destinationsSet.add(wawGdn);
        destinationsSet.add(wawPoz);
        destinationsSet.add(wawWro);
        destinationsSet.add(wawKrk);
        destinationsSet.add(gdnWaw);
        destinationsSet.add(pozWaw);
        destinationsSet.add(wroWaw);
        destinationsSet.add(krkWaw);

        return destinationsSet;
    }

    public Set<Flight> getDestinationsSet() {
        destinationsSet = destinationsSet();
        return new HashSet<>(destinationsSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destination)) return false;
        Destination that = (Destination) o;
        return destinationsSet.equals(that.destinationsSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationsSet);
    }
}