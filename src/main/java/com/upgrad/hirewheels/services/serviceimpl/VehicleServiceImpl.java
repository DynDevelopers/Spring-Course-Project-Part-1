package com.upgrad.hirewheels.services.serviceimpl;

import com.upgrad.hirewheels.dao.VehicleDAO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleDAO.findAll();
    }

    @Override
    public Vehicle getVehicleByUserID(int id) {
        return null;
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        return vehicleDAO.findAllByAvailableStatus();
    }
}
