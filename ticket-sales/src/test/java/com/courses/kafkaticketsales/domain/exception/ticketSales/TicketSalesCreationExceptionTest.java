package com.courses.kafkaticketsales.domain.exception.ticketSales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketSalesCreationExceptionTest {

    @Test
    public void testExceptionMessage() {
        TicketSalesCreationException exception = new TicketSalesCreationException();
        assertEquals("Unable to save ticket sales data at the moment.", exception.getMessage());
    }
}
