package com.courses.kafkaticketsales.infrastructure.adapters.input.rest.data.request;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketSalesCreateRequest {

    @NotNull(message = "Type may not be empty")
    private Type type;

    @NotNull(message = "Status may not be empty")
    private Status status;

    @NotNull(message = "EventId may not be empty")
    private UUID eventId;

    @NotNull(message = "SeatId may not be empty")
    private UUID seatId;

    @Positive
    private float price;

    @PositiveOrZero
    private float discount;

    @PositiveOrZero
    private float totalPrice;

    @NotNull(message = "BuyerId may not be empty")
    private UUID buyerId;
}
