package com.courses.kafkaticketsales.application.ports.output;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TicketSalesOutputPort {

    TicketSales saveTicketSales(TicketSales ticketSales);

    Optional<TicketSales> getTicketSaleById(UUID uuid);

    List<TicketSales> getTicketSaleByUser(UUID uuid);

    TicketSales updateTicketStatus(UUID uuid, TicketSales ticketSales);
}
