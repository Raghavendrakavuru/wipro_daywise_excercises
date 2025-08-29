package com.wipro.flightdatams.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name="flight_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="aircraft_name")
	private String aircraftName;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	private String source;
	
	private String destination;

	private double price;
	
	@Column(name="price_from")
	private LocalDate priceFrom;
	
	@Column(name="price_to")
	private LocalDate priceTo;
}