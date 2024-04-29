package com.example.lldcarrentalsystem.entities.vehicleEntities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class HireableVehicle {
    private String id ;
    private String name;
    private String licensePlateNumber ;
    private String qrCode ;
    private String make;
    private String model ;
    private String noOfSeats;
    private String yearOfManfactire;
    private double milage;
    private VehicleCategory vehicleCategory;
    private VehicleStatus vehicleStatus;
    private VehicleType vehicleType;
    private VehicleLocation location;
    private Coordinates locationCoordinates;
}
