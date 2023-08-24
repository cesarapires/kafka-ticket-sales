package com.courses.kafkaticketsales.application.ports.input;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;

import java.util.UUID;
import java.util.List;


public interface TicketSalesServiceInterface {

    TicketSales addTicketSales(TicketSales ticketSales);

    TicketSales getTicketSaleById(UUID uuid);

    List<TicketSales> getTicketSaleByUser(UUID uuidUser);

    void updateTicketStatus(UUID uuid, String status);
};
