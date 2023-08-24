package com.courses.kafkaticketsales.infrastructure.adapters.input.rest;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.application.ports.input.TicketSalesServiceInterface ;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request.TicketSalesCreateRequest;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.response.TicketSalesCreateResponse;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.mapper.TicketSalesRestMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class TickerSalesRestAdapter {

    private final TicketSalesServiceInterface ticketSalesService;

    private final TicketSalesRestMapper ticketSalesRestMapper;

    @PostMapping(value = "/ticket-sales")
    public ResponseEntity<TicketSalesCreateResponse> createTicketSales(@RequestBody @Valid TicketSalesCreateRequest ticketSalesCreateRequest) {

        TicketSales ticketSales = ticketSalesRestMapper.toTicketSales(ticketSalesCreateRequest);

        ticketSales = ticketSalesService.addTicketSales(ticketSales);

        TicketSalesCreateResponse ticketSalesCreateResponse = ticketSalesRestMapper.toTicketSalesCreateResponse(ticketSales);

        return new ResponseEntity<>(ticketSalesCreateResponse, HttpStatus.CREATED);
    }
}
