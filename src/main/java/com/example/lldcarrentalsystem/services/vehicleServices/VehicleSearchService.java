package com.example.lldcarrentalsystem.services.vehicleServices;

import com.example.lldcarrentalsystem.entities.vehicleEntities.HireableVehicle;
import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleType;

import java.time.LocalDateTime;
import java.util.List;

public interface VehicleSearchService {

    List<HireableVehicle> search(VehicleType vehicleType , String City , LocalDateTime froDate , LocalDateTime toDate );

    List<HireableVehicle> search(String noOffSeats , VehicleType vehicleType , String City , LocalDateTime froDate , LocalDateTime toDate );

    List<HireableVehicle> search(double startMilage , String City , LocalDateTime froDate , LocalDateTime toDate );
}
