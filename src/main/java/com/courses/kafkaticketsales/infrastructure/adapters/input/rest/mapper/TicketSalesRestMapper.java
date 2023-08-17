package com.courses.kafkaticketsales.infrastructure.adapters.input.rest.mapper;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request.TicketSalesCreateRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketSalesRestMapper {

    TicketSales toTicketSales (TicketSalesCreateRequest ticketSalesCreateRequest);
}
