package com.upgrad.hirewheels.dao;

import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("vehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle, Integer> {

    @Query(value = "FROM Vehicle WHERE vehicleid = ?1")
    public Vehicle find(int id);

    public List<Vehicle> findAll();

    @Transactional
    @Modifying
    @Query("update Vehicle v set v.availabilityStatus = :as where v.vehicleId = :id")
    public void changeAvailability(@Param("id") int id, @Param("as") int availability_status);

    @Query(value = "FROM Vehicle WHERE availability_status = 1")
    public List<Vehicle> findAllByAvailableStatus();
}
