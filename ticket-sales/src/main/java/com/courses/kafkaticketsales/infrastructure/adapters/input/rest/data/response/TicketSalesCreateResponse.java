package com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.response;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketSalesCreateResponse {
    private UUID id;

    private Type type;

    private Status status;

    private UUID eventId;

    private UUID seatId;

    private float price;

    private float discount;

    private float totalPrice;

    private UUID buyerId;
}
