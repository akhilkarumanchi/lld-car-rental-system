package com.example.lldcarrentalsystem.services.vehicleServices;

import com.example.lldcarrentalsystem.entities.vehicleEntities.HireableVehicle;
import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleType;

import java.time.LocalDateTime;
import java.util.List;

public class VehicleSearchServiceImpl implements VehicleSearchService {
    @Override
    public List<HireableVehicle> search(VehicleType vehicleType, String City, LocalDateTime froDate, LocalDateTime toDate) {
        return null;
    }

    @Override
    public List<HireableVehicle> search(String model, VehicleType vehicleType, String City, LocalDateTime froDate, LocalDateTime toDate) {
        return null;
    }

    @Override
    public List<HireableVehicle> search(double startMilage, String City, LocalDateTime froDate, LocalDateTime toDate) {
        return null;
    }
}
