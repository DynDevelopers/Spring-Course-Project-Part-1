package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.FuelType;
import com.upgrad.hirewheels.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("locationDAO")
public interface LocationDAO extends JpaRepository<Location, Integer> {
//    public Location saveLocation(Location location);
}
