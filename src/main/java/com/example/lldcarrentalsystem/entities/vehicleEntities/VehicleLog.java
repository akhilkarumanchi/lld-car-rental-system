package com.example.lldcarrentalsystem.entities.vehicleEntities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VehicleLog {
    String vehicleLogId ;
    String vehicleId ;
    VehicleStatus vehicleStatus;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    String description;
    VehicleLogType vehicleLogType;
}
