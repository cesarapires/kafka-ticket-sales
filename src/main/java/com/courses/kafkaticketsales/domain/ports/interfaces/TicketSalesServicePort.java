package com.courses.kafkaticketsales.domain.ports.interfaces;

import com.courses.kafkaticketsales.domain.dtos.ticketSalesDTO.TicketSalesDTO;

import java.util.UUID;
import java.util.List;


public interface TicketSalesServicePort {

    void addTicketSales(TicketSalesDTO ticketSalesDTO);

    TicketSalesDTO getTicketSaleById(UUID uuid);

    List<TicketSalesDTO> getTicketSaleByUser(UUID uuidUser);

    void updateTicketStatus(UUID uuid, String status);
};
