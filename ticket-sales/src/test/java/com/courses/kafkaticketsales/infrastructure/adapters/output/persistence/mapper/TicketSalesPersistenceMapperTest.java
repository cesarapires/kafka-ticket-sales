package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.mapper;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TicketSalesPersistenceMapperTest {

    private TicketSalesEntity ticketSalesEntity;

    private TicketSales ticketSales;

    @BeforeEach
    void setUp() {
        initTicketSalesEntity();
        initTicketSales();
    }

    @Test
    public void testShouldMapperTicketSalesToTicketSalesEntity() {
        // Arrange
        TicketSalesEntity ticketSalesTest;
        TicketSalesPersistenceMapperImpl ticketSalesPersistenceMapper = new TicketSalesPersistenceMapperImpl();

        // Action
        ticketSalesTest = ticketSalesPersistenceMapper.toTicketSalesEntity(ticketSales);

        // Assert
        assertEquals(ticketSales.getId(), ticketSalesTest.getId());
        assertEquals(ticketSales.getType(), ticketSalesTest.getType());
        assertEquals(ticketSales.getStatus(), ticketSalesTest.getStatus());
        assertEquals(ticketSales.getEventId(), ticketSalesTest.getEventId());
        assertEquals(ticketSales.getSeatId(), ticketSalesTest.getSeatId());
        assertEquals(ticketSales.getPrice(), ticketSalesTest.getPrice());
        assertEquals(ticketSales.getDiscount(), ticketSalesTest.getDiscount());
        assertEquals(ticketSales.getTotalPrice(), ticketSalesTest.getTotalPrice());
        assertEquals(ticketSales.getBuyerId(), ticketSalesTest.getBuyerId());
    }

    @Test
    public void testShouldMapperTicketSalesToTicketSalesEntityWhenTicketSalesIsNull() {
        // Arrange
        TicketSalesEntity ticketSalesTest;
        TicketSalesPersistenceMapperImpl ticketSalesPersistenceMapper = new TicketSalesPersistenceMapperImpl();

        // Action
        ticketSalesTest = ticketSalesPersistenceMapper.toTicketSalesEntity(null);

        // Assert
        assertNull(ticketSalesTest);
    }

    @Test
    public void testShouldMapperTicketSalesEntityToTicketSales() {
        // Arrange
        TicketSales ticketSalesTest;
        TicketSalesPersistenceMapperImpl ticketSalesPersistenceMapper = new TicketSalesPersistenceMapperImpl();

        // Action
        ticketSalesTest = ticketSalesPersistenceMapper.toTicketSales(ticketSalesEntity);

        // Assert
        assertEquals(ticketSalesEntity.getId(), ticketSalesTest.getId());
        assertEquals(ticketSalesEntity.getType(), ticketSalesTest.getType());
        assertEquals(ticketSalesEntity.getStatus(), ticketSalesTest.getStatus());
        assertEquals(ticketSalesEntity.getEventId(), ticketSalesTest.getEventId());
        assertEquals(ticketSalesEntity.getSeatId(), ticketSalesTest.getSeatId());
        assertEquals(ticketSalesEntity.getPrice(), ticketSalesTest.getPrice());
        assertEquals(ticketSalesEntity.getDiscount(), ticketSalesTest.getDiscount());
        assertEquals(ticketSalesEntity.getTotalPrice(), ticketSalesTest.getTotalPrice());
        assertEquals(ticketSalesEntity.getBuyerId(), ticketSalesTest.getBuyerId());
    }

    @Test
    public void testShouldMapperTicketSalesEntityToTicketSalesWhenTicketSalesEntityIsNull() {
        // Arrange
        TicketSales ticketSalesTest;
        TicketSalesPersistenceMapperImpl ticketSalesPersistenceMapper = new TicketSalesPersistenceMapperImpl();

        // Action
        ticketSalesTest = ticketSalesPersistenceMapper.toTicketSales(null);

        // Assert
        assertNull(ticketSalesTest);
    }

    private void initTicketSalesEntity() {
        this.ticketSalesEntity = new TicketSalesEntity();

        this.ticketSalesEntity.setId(UUID.randomUUID());
        this.ticketSalesEntity.setType(Type.REGULAR);
        this.ticketSalesEntity.setStatus(Status.SOLD);
        this.ticketSalesEntity.setEventId(UUID.randomUUID());
        this.ticketSalesEntity.setSeatId(UUID.randomUUID());
        this.ticketSalesEntity.setPrice(100.0f);
        this.ticketSalesEntity.setDiscount(10.0f);
        this.ticketSalesEntity.setTotalPrice(90.0f);
        this.ticketSalesEntity.setBuyerId(UUID.randomUUID());
    }

    private void initTicketSales() {
        this.ticketSales = new TicketSales();

        this.ticketSales.setId(UUID.randomUUID());
        this.ticketSales.setType(this.ticketSalesEntity.getType());
        this.ticketSales.setStatus(this.ticketSalesEntity.getStatus());
        this.ticketSales.setEventId(this.ticketSales.getEventId());
        this.ticketSales.setSeatId(this.ticketSalesEntity.getSeatId());
        this.ticketSales.setPrice(this.ticketSales.getPrice());
        this.ticketSales.setDiscount(this.ticketSales.getDiscount());
        this.ticketSales.setTotalPrice(this.ticketSales.getTotalPrice());
        this.ticketSales.setBuyerId(this.ticketSales.getBuyerId());
    }

}