package com.courses.kafkaticketsales.domain.dtos.ticketSalesDTO;

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
        TicketSalesDTO ticketSalesDTO = new TicketSalesDTO(id, type, status, eventId, seatId, price, discount, totalPrice, buyerId);

        // Asserts
        Assertions.assertEquals(id, ticketSalesDTO.getId());
        Assertions.assertEquals(type, ticketSalesDTO.getType());
        Assertions.assertEquals(status, ticketSalesDTO.getStatus());
        Assertions.assertEquals(eventId, ticketSalesDTO.getEventId());
        Assertions.assertEquals(seatId, ticketSalesDTO.getSeatId());
        Assertions.assertEquals(price, ticketSalesDTO.getPrice());
        Assertions.assertEquals(discount, ticketSalesDTO.getDiscount());
        Assertions.assertEquals(totalPrice, ticketSalesDTO.getTotalPrice());
        Assertions.assertEquals(buyerId, ticketSalesDTO.getBuyerId());
    }
}