package com.courses.kafkaticketsales.domain.model.ticketSales;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketSales {
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
