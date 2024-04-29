package com.example.lldcarrentalsystem.services.userServices;

import com.example.lldcarrentalsystem.entities.vehicleEntities.HireableVehicle;
import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleLocation;
import com.example.lldcarrentalsystem.vehicleReservation.Reservation;

import java.time.LocalDateTime;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public Reservation scanToReserve(String scanQr, String userId) {
        return null;
    }

    @Override
    public Reservation remoteReserve(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation cancelReserve(String reservationId) {
        return null;
    }

    @Override
    public void returnVehicle(String reservatioId, VehicleLocation vehicleLocation) {

    }

    @Override
    public List<HireableVehicle> getHireableVehicles(String userId) {
        return null;
    }

    @Override
    public List<HireableVehicle> getHireableVehicles(String city, LocalDateTime fromDate, LocalDateTime toDate) {
        return null;
    }
}
