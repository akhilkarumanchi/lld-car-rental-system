package com.example.lldcarrentalsystem.vehicleReservation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class VehicleAddOns {
    private String id ;
    private String name ;
    private String description ;
    private double cost ;
}
