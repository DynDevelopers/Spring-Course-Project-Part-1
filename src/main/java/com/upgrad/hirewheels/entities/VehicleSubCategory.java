package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class VehicleSubCategory {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int vehicleSubcategoryId;

    @Column(name = "vehicle_subcategory_name", nullable = false, unique = true)
    private String vehicleSubcategoryName;

    @Column(name = "pricePerDay", nullable = false)
    private int pricePerDay;

//    @Column(name = "vehicle_category_id", nullable = false)
//    private int vehicleCategoryId;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id")
    private VehicleCategory vehicleCategory;

    @OneToMany(mappedBy = "vehicleSubCategory")
    private List<Vehicle> vehicles;
}