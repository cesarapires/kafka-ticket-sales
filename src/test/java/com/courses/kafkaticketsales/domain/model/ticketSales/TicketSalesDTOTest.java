package com.courses.kafkaticketsales.domain.model.ticketSales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.UUID;

public class TicketSalesDTOTest {

    @Test
    public void testTicketSalesDTO() {
        // Arranges
        UUID id = UUID.randomUUID();
        Type type = Type.VIP;
        Status status = Status.SOLD;
        UUID eventId = UUID.randomUUID();
        UUID seatId = UUID.randomUUID();
        float price = 100.0f;
        float discount = 10.0f;
        float totalPrice = price - discount;
        UUID buyerId = UUID.randomUUID();

        // Actions
        TicketSales ticketSales = new TicketSales(id, type, status, eventId, seatId, price, discount, totalPrice, buyerId);

        // Asserts
        Assertions.assertEquals(id, ticketSales.getId());
        Assertions.assertEquals(type, ticketSales.getType());
        Assertions.assertEquals(status, ticketSales.getStatus());
        Assertions.assertEquals(eventId, ticketSales.getEventId());
        Assertions.assertEquals(seatId, ticketSales.getSeatId());
        Assertions.assertEquals(price, ticketSales.getPrice());
        Assertions.assertEquals(discount, ticketSales.getDiscount());
        Assertions.assertEquals(totalPrice, ticketSales.getTotalPrice());
        Assertions.assertEquals(buyerId, ticketSales.getBuyerId());
    }
}