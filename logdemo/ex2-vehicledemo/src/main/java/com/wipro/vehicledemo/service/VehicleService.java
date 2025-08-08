package com.wipro.vehicledemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.vehicledemo.entity.Vehicle;
import com.wipro.vehicledemo.repo.VehicleRepo;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepo vehicleRepo;
	
	public Vehicle saveMove(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}
	
	public List<Vehicle> getAllVehicles(){
		return vehicleRepo.findAll();
	}
}
