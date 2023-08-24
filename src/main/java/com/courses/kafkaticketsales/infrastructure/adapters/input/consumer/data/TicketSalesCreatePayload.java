package com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.data;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketSalesCreatePayload {
    private UUID id;

    private Type type;

    private Status status;

    @SerializedName("event_id")
    private UUID eventId;

    @SerializedName("seat_id")
    private UUID seatId;

    private float price;

    private float discount;

    @SerializedName("total_price")
    private float totalPrice;

    @SerializedName("buyer_id")
    private UUID buyerId;
}