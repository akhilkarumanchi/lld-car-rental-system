package com.example.lldcarrentalsystem.entities.vehicleEntities;

import com.example.lldcarrentalsystem.vehicleReservation.Reservation;
import com.example.lldcarrentalsystem.vehicleReservation.VehicleReservationType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VehicleInventory {

    public VehicleInventory(){

    }

    //Attributes
    private String id;
    private String reservationId;
    private LocalDateTime reservationDate;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private double startMilage;
    private double endMilage;
    private HireableVehicle vehicle;
    private VehicleReservationType vehicleReservationType;
    public VehicleInventory(Reservation reservation, HireableVehicle hireableVehicle) {
        this.id = reservation.getReservationId();
        this.reservationDate = reservation.getFromDate();
        this.returnDate = reservation.getReturnDate();
        this.dueDate = reservation.getDueDate();
        this.startMilage = reservation.getStartMilage();
        this.endMilage = reservation.getEndMilage();
        this.vehicleReservationType = reservation.getVehicleReservationType();
        this.vehicle = hireableVehicle;
    }
    public VehicleInventory(HireableVehicle hireableVehicle) {
        this.id = hireableVehicle.getId();
        this.startMilage = hireableVehicle.getMilage();
        this.endMilage = hireableVehicle.getMilage();
        this.vehicle = hireableVehicle;
    }
}
