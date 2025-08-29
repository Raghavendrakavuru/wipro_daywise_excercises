package com.wipro.flightdatams.dto;

import java.time.LocalDate;

public class FlightDto {
	Long id;
	String aircraftName;
	String flightNumber;
    String source; 
    String destination; 
    double price;
    LocalDate date;
}