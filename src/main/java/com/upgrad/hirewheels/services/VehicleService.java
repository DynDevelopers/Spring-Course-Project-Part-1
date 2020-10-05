package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    public List<Vehicle> getAllVehicles ();
    public Vehicle getVehicleByUserID(int id);
    public List<Vehicle> getAvailableVehicles();
}
