package com.example.lldcarrentalsystem.vehicleReservation;

import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleFixedCost {

    public static Map<VehicleType, Double> vehicleHourlyCost = new HashMap<>();

    static {
        vehicleHourlyCost.put(VehicleType.BICYCLE,5.0);
        vehicleHourlyCost.put(VehicleType.MOTORCYCLE,15.0);
        vehicleHourlyCost.put(VehicleType.THREEWHEELER,25.0);
        vehicleHourlyCost.put(VehicleType.HATCHBAG,35.0);
        vehicleHourlyCost.put(VehicleType.TRUCK,75.0);
        vehicleHourlyCost.put(VehicleType.SEDAN,45.0);
        vehicleHourlyCost.put(VehicleType.SUV, 55.0);
        vehicleHourlyCost.put(VehicleType.VAN, 65.0);
    }
}
