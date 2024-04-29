package com.example.lldcarrentalsystem.services.invoiceService;

import com.example.lldcarrentalsystem.entities.inVoiceEntities.InVoice;
import com.example.lldcarrentalsystem.vehicleReservation.Reservation;

public interface InvoiceService {

    InVoice computeInvoice(Reservation reservation);
}
