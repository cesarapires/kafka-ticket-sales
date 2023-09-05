package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.mapper.TicketSalesPersistenceMapper;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.repository.TicketSalesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.mockito.Mockito.*;

class TicketSalesPersistenceAdapterTest {

    @InjectMocks
    private TicketSalesPersistenceAdapter ticketSalesPersistenceAdapter;

    @Mock
    private TicketSalesRepository ticketSalesRepository;

    @Mock
    private TicketSalesPersistenceMapper ticketSalesPersistenceMapper;

    private TicketSalesEntity ticketSalesEntity;

    private TicketSales ticketSales;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.initTicketSalesEntity();
        this.initTicketSales();
    }

    @Test
    public void testShouldSaveTicketSales() {
        when(ticketSalesPersistenceMapper.toTicketSalesEntity(this.ticketSales)).thenReturn(this.ticketSalesEntity);
        when(ticketSalesRepository.save(this.ticketSalesEntity)).thenReturn(this.ticketSalesEntity);

        TicketSales result = ticketSalesPersistenceAdapter.saveTicketSales(this.ticketSales);

        verify(ticketSalesPersistenceMapper, times(1)).toTicketSalesEntity(ticketSales);
        verify(ticketSalesRepository, times(1)).save(ticketSalesEntity);
    }

    private void initTicketSalesEntity() {
        this.ticketSalesEntity = new TicketSalesEntity();

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