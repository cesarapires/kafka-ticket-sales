package com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TicketSalesCreateRequestTest {

    @Test
    public void testTicketSalesCreateRequest() {
        // Arranges
        Type type = Type.GENERAL_ACCESS;
        Status status = Status.RESERVED;
        UUID eventId = UUID.randomUUID();
        UUID seatId = UUID.randomUUID();
        float price = 100.0f;
        float discount = 10.0f;
        float totalPrice = price - discount;
        UUID buyerId = UUID.randomUUID();

        // Actions
        TicketSalesCreateRequest ticketSalesCreateRequest = new TicketSalesCreateRequest(type, status, eventId, seatId, price, discount, totalPrice, buyerId);

        // Asserts
        Assertions.assertEquals(type, ticketSalesCreateRequest.getType());
        Assertions.assertEquals(status, ticketSalesCreateRequest.getStatus());
        Assertions.assertEquals(eventId, ticketSalesCreateRequest.getEventId());
        Assertions.assertEquals(seatId, ticketSalesCreateRequest.getSeatId());
        Assertions.assertEquals(price, ticketSalesCreateRequest.getPrice());
        Assertions.assertEquals(discount, ticketSalesCreateRequest.getDiscount());
        Assertions.assertEquals(totalPrice, ticketSalesCreateRequest.getTotalPrice());
        Assertions.assertEquals(buyerId, ticketSalesCreateRequest.getBuyerId());
    }
}