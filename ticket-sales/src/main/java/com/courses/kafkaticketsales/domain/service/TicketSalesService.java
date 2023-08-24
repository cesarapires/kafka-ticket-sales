package com.courses.kafkaticketsales.domain.service;

import com.courses.kafkaticketsales.application.ports.input.TicketSalesServiceInterface;
import com.courses.kafkaticketsales.application.ports.output.TicketSalesEventPublisher;
import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;
import com.courses.kafkaticketsales.domain.exception.ticketSales.TicketSalesCreationException;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.TicketSalesPersistenceAdapter;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class TicketSalesService implements TicketSalesServiceInterface {

    private final TicketSalesPersistenceAdapter ticketSalesPersistenceAdapter;

    private final TicketSalesEventPublisher ticketSalesEventPublisher;

    @Override
    public TicketSales addTicketSales(TicketSales ticketSales) {
        ticketSales = ticketSalesPersistenceAdapter.saveTicketSales(ticketSales);

        if (ticketSales.getId() == null) {
            throw new TicketSalesCreationException();
        }

        ticketSalesEventPublisher.publishTicketSalesCreatedEvent(new TicketSalesCreatedEvent(ticketSales.getId()));

        return ticketSales;
    }

    @Override
    public TicketSales getTicketSaleById(UUID uuid) {
        return null;
    }

    @Override
    public List<TicketSales> getTicketSaleByUser(UUID uuidUser) {
        return null;
    }

    @Override
    public void updateTicketStatus(UUID uuid, String status) {

    }
}
