package com.example.lldcarrentalsystem.services.userServices;

import com.example.lldcarrentalsystem.entities.vehicleEntities.HireableVehicle;
import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleLocation;
import com.example.lldcarrentalsystem.vehicleReservation.Reservation;

import java.time.LocalDateTime;
import java.util.List;

public interface UserService {
    Reservation scanToReserve(String scanQr , String userId);
    Reservation remoteReserve(Reservation reservation);
    Reservation cancelReserve(String reservationId);
    void returnVehicle(String reservatioId , VehicleLocation vehicleLocation);
    List<HireableVehicle> getHireableVehicles(String userId);
    List<HireableVehicle> getHireableVehicles(String city, LocalDateTime fromDate , LocalDateTime toDate);
}
