package com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.mapper;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.data.TicketSalesCreatePayload;
import com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.response.TicketSalesCreateResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketSalesConsumerMapper {
    TicketSales toTicketSales (TicketSalesCreatePayload ticketSalesCreateResponse);
}
