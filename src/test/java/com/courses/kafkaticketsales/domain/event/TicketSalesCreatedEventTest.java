package com.courses.kafkaticketsales.domain.event;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TicketSalesCreatedEventTest {
    @Test
    public void testTicketSalesDTO() {
        // Arranges
        UUID id = UUID.randomUUID();
        LocalDateTime dateTime;

        // Actions
        TicketSalesCreatedEvent ticketSalesCreatedEvent = new TicketSalesCreatedEvent(id);
        dateTime = ticketSalesCreatedEvent.getDateTime();

        // Asserts
        Assertions.assertEquals(id, ticketSalesCreatedEvent.getId());
        Assertions.assertEquals(dateTime, ticketSalesCreatedEvent.getDateTime());
    }
}