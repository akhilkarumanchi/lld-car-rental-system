package com.example.lldcarrentalsystem.vehicleReservation;

import com.example.lldcarrentalsystem.entities.userEntities.Address;
import com.example.lldcarrentalsystem.entities.vehicleEntities.VehicleType;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Reservation {
    private String reservationId ;
    private String reservationStatus;
    private String userId ;
    private LocalDateTime fromDate ;
    private LocalDateTime dueDate ;
    private LocalDateTime returnDate ;
    private Address pickUpLocation;
    private Address dropLocation;
    private double startMilage ;
    private double endMilage ;
    private String allocatedvehicleID ;
    private VehicleType vehicleType;
    private String inVoiceId ;
    private List<VehicleAddOns> vehicleAddOnsList;
    private List<AddOnServices> addOnServicesList;
    private VehicleReservationType vehicleReservationType;
}
