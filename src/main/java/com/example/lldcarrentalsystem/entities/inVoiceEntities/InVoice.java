package com.example.lldcarrentalsystem.entities.inVoiceEntities;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Setter
@Getter
public class InVoice {
    private String inVoiceId;
    private LocalDateTime creationDate;
    private double baseFare;
    private double addOnServices;
    private double vehicleAddOns;
    private double cgst;
    private double sgst;
    private double totalAmount ;
}