package com.example.lldcarrentalsystem.services.invoiceService;

import com.example.lldcarrentalsystem.entities.inVoiceEntities.InVoice;
import com.example.lldcarrentalsystem.vehicleReservation.Reservation;
import com.example.lldcarrentalsystem.vehicleReservation.VehicleReservationType;

public class MonthlyInvoiceService implements InvoiceService{
    @Override
    public InVoice computeInvoice(Reservation reservation) {
        return buildInvoice(reservation);
    }

    public InVoice buildInvoice(Reservation reservation) {
        InVoice invoice = new InVoice();

        return invoice;
    }
}
