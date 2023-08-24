package com.courses.kafkaticketsales.domain.exception.ticketSales;

public class TicketSalesCreationException extends RuntimeException {
    public TicketSalesCreationException() {
        super("Unable to save ticket sales data at the moment.");
    }
}
