package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TicketSalesEntityTest {

    @Test
    public void testTicketSalesEntityConstruction() {
        UUID id = UUID.randomUUID();
        Type type = Type.REGULAR;
        Status status = Status.SOLD;
        UUID eventId = UUID.randomUUID();
        UUID seatId = UUID.randomUUID();
        float price = 100.0f;
        float discount = 10.0f;
        float totalPrice = price - discount;
        UUID buyerId = UUID.randomUUID();

        TicketSalesEntity ticketSalesEntity = new TicketSalesEntity(
                id,
                type,
                status,
                eventId,
                seatId,
                price,
                discount,
                totalPrice,
                buyerId
        );

        assertEquals(id, ticketSalesEntity.getId());
        assertEquals(type, ticketSalesEntity.getType());
        assertEquals(status, ticketSalesEntity.getStatus());
        assertEquals(eventId, ticketSalesEntity.getEventId());
        assertEquals(seatId, ticketSalesEntity.getSeatId());
        assertEquals(price, ticketSalesEntity.getPrice());
        assertEquals(discount, ticketSalesEntity.getDiscount());
        assertEquals(totalPrice, ticketSalesEntity.getTotalPrice());
        assertEquals(buyerId, ticketSalesEntity.getBuyerId());
    }

    @Test
    public void testTicketSalesEntitySetters() {
        TicketSalesEntity ticketSalesEntity = new TicketSalesEntity();

        UUID id = UUID.randomUUID();
        ticketSalesEntity.setId(id);

        Type type = Type.REGULAR;
        ticketSalesEntity.setType(type);

        Status status = Status.SOLD;
        ticketSalesEntity.setStatus(status);

        UUID eventId = UUID.randomUUID();
        ticketSalesEntity.setEventId(eventId);

        UUID seatId = UUID.randomUUID();
        ticketSalesEntity.setSeatId(seatId);

        float price = 100.0f;
        ticketSalesEntity.setPrice(price);

        float discount = 10.0f;
        ticketSalesEntity.setDiscount(discount);

        float totalPrice = price - discount;
        ticketSalesEntity.setTotalPrice(totalPrice);

        UUID buyerId = UUID.randomUUID();
        ticketSalesEntity.setBuyerId(buyerId);

        assertEquals(id, ticketSalesEntity.getId());
        assertEquals(type, ticketSalesEntity.getType());
        assertEquals(status, ticketSalesEntity.getStatus());
        assertEquals(eventId, ticketSalesEntity.getEventId());
        assertEquals(seatId, ticketSalesEntity.getSeatId());
        assertEquals(price, ticketSalesEntity.getPrice());
        assertEquals(discount, ticketSalesEntity.getDiscount());
        assertEquals(totalPrice, ticketSalesEntity.getTotalPrice());
        assertEquals(buyerId, ticketSalesEntity.getBuyerId());
    }
}