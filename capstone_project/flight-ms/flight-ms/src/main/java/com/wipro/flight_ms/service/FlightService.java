package com.wipro.flight_ms.service;

import com.wipro.flight_ms.entity.Flight;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {

	List<Flight> searchFlights(String source, String destination, LocalDate travelDate);
    Flight addFlight(Flight flight);
    List<Flight> getAllFlights();
    Flight getFlightById(Long id);
    Flight updateFlight(Long id, Flight updatedFlight);
	void deleteFlight(Long id);
}
