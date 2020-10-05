package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @Column(name = "vehicleModel", nullable = false)
    private String vehicleModel;
    @Column(name = "vehicle_number", nullable = false)
    private String vehicleNumber;

    @Column(name = "color", nullable = false)
    private String color;

//    @Column(name = "location_id", nullable = false)
//    private int locationId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

//    @Column(name = "fuel_type_id", nullable = false)
//    private int fuelTypeId;


//    @Column(name = "vehicle_subcategory_id")
//    private int vehicleSubcategoryId;

    @ManyToOne
    private VehicleSubCategory vehicleSubCategory;

//    @JoinColumn(name="fuel_type_id")
    @ManyToOne
    private FuelType fuelType;

    @Column(name = "availability_status", nullable = false)
    private int availabilityStatus;

    @Column(name = "vehicle_image_url", nullable = false)
    private String vehicleImageUrl;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "vehicle")
    private List<Booking> bookings;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", color='" + color + '\'' +
                ", location=" + location.getLocationName() +
                ", vehicleSubCategory=" + vehicleSubCategory.getVehicleSubcategoryName() +
                ", fuelType=" + fuelType.getFuelType() +
                ", availabilityStatus=" + availabilityStatus +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }
}
