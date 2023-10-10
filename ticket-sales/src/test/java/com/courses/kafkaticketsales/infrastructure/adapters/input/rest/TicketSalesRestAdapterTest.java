package com.courses.kafkaticketsales.infrastructure.adapters.input.rest;

import com.courses.kafkaticketsales.application.ports.input.TicketSalesServiceInterface;
import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request.TicketSalesCreateRequest;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.response.TicketSalesCreateResponse;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.mapper.TicketSalesRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TicketSalesRestAdapterTest {

    @InjectMocks
    private TicketSalesRestAdapter ticketSalesRestAdapter;

    @Mock
    private TicketSalesServiceInterface ticketSalesService;

    @Mock
    private TicketSalesRestMapper ticketSalesRestMapper;

    private TicketSalesCreateRequest ticketSalesRequest;

    private TicketSales ticketSales;

    private TicketSalesCreateResponse ticketSalesResponse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.initTicketSalesCreateRequest();
        this.initTicketSales();
        this.initTicketSalesCreateResponse();
    }

    @Test
    public void testShouldReceiveTicketSalesSaveAndReturnResponse() {
        when(ticketSalesRestMapper.toTicketSales(this.ticketSalesRequest)).thenReturn(this.ticketSales);

        when(ticketSalesService.addTicketSales(this.ticketSales)).thenReturn(this.ticketSales);

        when(ticketSalesRestMapper.toTicketSalesCreateResponse(this.ticketSales)).thenReturn(this.ticketSalesResponse);

        ResponseEntity<TicketSalesCreateResponse> result = ticketSalesRestAdapter.createTicketSales(this.ticketSalesRequest);

        assertEquals(HttpStatus.CREATED, result.getStatusCode());
        assertEquals(ticketSalesResponse, result.getBody());

        verify(ticketSalesRestMapper, times(1)).toTicketSales(this.ticketSalesRequest);
        verify(ticketSalesService, times(1)).addTicketSales(this.ticketSales);
        verify(ticketSalesRestMapper, times(1)).toTicketSalesCreateResponse(this.ticketSales);
    }

    private void initTicketSalesCreateRequest() {
        this.ticketSalesRequest = new TicketSalesCreateRequest();

        this.ticketSalesRequest.setType(Type.REGULAR);
        this.ticketSalesRequest.setStatus(Status.SOLD);
        this.ticketSalesRequest.setEventId(UUID.randomUUID());
        this.ticketSalesRequest.setSeatId(UUID.randomUUID());
        this.ticketSalesRequest.setPrice(100.0f);
        this.ticketSalesRequest.setDiscount(10.0f);
        this.ticketSalesRequest.setTotalPrice(90.0f);
        this.ticketSalesRequest.setBuyerId(UUID.randomUUID());
    }

    private void initTicketSales() {
        this.ticketSales = new TicketSales();

        this.ticketSales.setType(this.ticketSalesRequest.getType());
        this.ticketSales.setStatus(this.ticketSalesRequest.getStatus());
        this.ticketSales.setEventId(this.ticketSales.getEventId());
        this.ticketSales.setSeatId(this.ticketSalesRequest.getSeatId());
        this.ticketSales.setPrice(this.ticketSales.getPrice());
        this.ticketSales.setDiscount(this.ticketSales.getDiscount());
        this.ticketSales.setTotalPrice(this.ticketSales.getTotalPrice());
        this.ticketSales.setBuyerId(this.ticketSales.getBuyerId());
    }

    private void initTicketSalesCreateResponse() {
        this.ticketSalesResponse = new TicketSalesCreateResponse();

        this.ticketSalesResponse.setType(this.ticketSales.getType());
        this.ticketSalesResponse.setStatus(this.ticketSales.getStatus());
        this.ticketSalesResponse.setEventId(this.ticketSales.getEventId());
        this.ticketSalesResponse.setSeatId(this.ticketSales.getSeatId());
        this.ticketSalesResponse.setPrice(this.ticketSales.getPrice());
        this.ticketSalesResponse.setDiscount(this.ticketSales.getDiscount());
        this.ticketSalesResponse.setTotalPrice(this.ticketSales.getTotalPrice());
        this.ticketSalesResponse.setBuyerId(this.ticketSales.getBuyerId());
    }
}