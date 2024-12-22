package com.parking.parkinglot.entities;

import com.parking.parkinglot.servlets.Users;
import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue // Generare automată a ID-ului
    @Column(name = "id", nullable = false)
    private Long id;

    private String parkingSpot;

    private String licensePlate;

    // Getteri și Setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

}

