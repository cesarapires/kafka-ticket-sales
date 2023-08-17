package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.mapper;

import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TicketSalesPersistenceMapper {

    TicketSalesEntity toTicketSalesEntity(TicketSales ticketSales);

    TicketSales toTicketSales(TicketSalesEntity ticketSalesEntity);
}
