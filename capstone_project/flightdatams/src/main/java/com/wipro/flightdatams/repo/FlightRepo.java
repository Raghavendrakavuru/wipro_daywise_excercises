package com.wipro.flightdatams.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

import com.wipro.flightdatams.entity.Flight;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {

    @Query("SELECT f FROM Flight f " +
           "WHERE f.source = :source " +
           "AND f.destination = :destination " +
           "AND :travelDate BETWEEN f.priceFrom AND f.priceTo")
    List<Flight> searchFlights(@Param("source") String source,
                               @Param("destination") String destination,
                               @Param("travelDate") LocalDate travelDate);
}