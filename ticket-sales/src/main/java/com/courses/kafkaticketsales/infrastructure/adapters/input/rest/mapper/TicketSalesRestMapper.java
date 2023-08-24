package com.courses.kafkaticketsales.infrastructure.adapters.input.rest.mapper;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request.TicketSalesCreateRequest;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.response.TicketSalesCreateResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketSalesRestMapper {

    TicketSales toTicketSales (TicketSalesCreateRequest ticketSalesCreateRequest);

    TicketSalesCreateResponse toTicketSalesCreateResponse (TicketSales ticketSales);
}
