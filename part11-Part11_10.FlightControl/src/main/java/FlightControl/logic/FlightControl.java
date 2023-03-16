/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import java.util.Collection;
import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;
import FlightControl.domain.Place;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author crist
 */
public class FlightControl {
    
    private Map<String, Airplane> airplanes;
    private Map<String, Flight> flights;
    private Map<String, Place> places;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();                
    }
    
    public void addAirplane(String ID, int capacity) {
        this.airplanes.put(ID, new Airplane(ID, capacity));
    }
    
    public void addFlight(Airplane airplane, String departure, String destination) {
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(destination, new Place(destination));
        Flight flight = new Flight(airplane, this.places.get(departure), this.places.get(destination));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAllAirplanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
    
}
