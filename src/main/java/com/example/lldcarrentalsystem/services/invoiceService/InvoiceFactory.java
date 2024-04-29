package com.example.lldcarrentalsystem.services.invoiceService;

import com.example.lldcarrentalsystem.vehicleReservation.VehicleReservationType;

public class InvoiceFactory {
    public InvoiceService getInvoice(VehicleReservationType vehicleReservationType){

        switch(vehicleReservationType){
            case DAY:
                return new DayInvoiceService();
            case HOURLY:
                return new HourlyInvoiceService();
            case MONTH:
                return new MonthlyInvoiceService();
            default:
                return new HourlyInvoiceService();
        }
    }
}
