package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity;

import com.courses.kafkaticketsales.domain.model.ticketSales.Status;
import com.courses.kafkaticketsales.domain.model.ticketSales.Type;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketSalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;

    private UUID eventId;

    private UUID seatId;

    private float price;

    private float discount;

    private float totalPrice;

    private UUID buyerId;
}
