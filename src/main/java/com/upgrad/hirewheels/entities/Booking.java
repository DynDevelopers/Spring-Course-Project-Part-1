package com.upgrad.hirewheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "pickup_date")
    private LocalDate pickupDate;

    @Column(name = "dropoff_date")
    private LocalDate dropoffDate;

    @Column(name = "booking_date")
    private Date bookingDate;

    @Column(name = "amount")
    private int amount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Location location;
//    @Column(name = "location_id")
//    private int locationId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Vehicle vehicle;

//    @Column(name = "vehicle_id")
//    private int vehicleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

//    @Column(name = "user_id")
//    private int userId;
}