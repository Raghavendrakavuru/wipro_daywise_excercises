package com.wipro.vehicledemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.vehicledemo.entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle,Integer>{

}
