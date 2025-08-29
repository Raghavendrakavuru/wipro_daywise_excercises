package com.wipro.flightdatams.service;

import java.time.LocalDate;
import java.util.List;

import com.wipro.flightdatams.entity.Flight;


public interface FlightService {
	
	List<Flight> findAll();
	Flight findById(int id);
    Flight save(Flight flight);
	Flight update(Flight flight);
	void deleteById(int id);
	List<Flight> search(String source, String destination, LocalDate date);

}
