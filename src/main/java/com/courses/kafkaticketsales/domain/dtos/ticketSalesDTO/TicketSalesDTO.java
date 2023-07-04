package com.courses.kafkaticketsales.domain.dtos.ticketSalesDTO;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketSalesDTO {
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
