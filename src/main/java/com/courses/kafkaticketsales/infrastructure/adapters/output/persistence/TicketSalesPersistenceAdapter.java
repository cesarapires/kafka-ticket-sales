package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence;

import com.courses.kafkaticketsales.application.ports.output.TicketSalesOutputPort;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.mapper.TicketSalesPersistenceMapper;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.repository.TicketSalesRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class TicketSalesPersistenceAdapter implements TicketSalesOutputPort {

    private final TicketSalesRepository ticketSalesRepository;

    private final TicketSalesPersistenceMapper ticketSalesPersistenceMapper;

    @Override
    public TicketSales saveTicketSales(TicketSales ticketSales) {
        TicketSalesEntity ticketSalesEntity = ticketSalesPersistenceMapper.toTicketSalesEntity(ticketSales);

        ticketSalesEntity = ticketSalesRepository.save(ticketSalesEntity);

        return ticketSalesPersistenceMapper.toTicketSales(ticketSalesEntity);
    }

    @Override
    public Optional<TicketSales> getTicketSaleById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<TicketSales> getTicketSaleByUser(UUID uuid) {
        return null;
    }

    @Override
    public TicketSales updateTicketStatus(UUID uuid, TicketSales ticketSales) {
        return null;
    }
}
