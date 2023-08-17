package com.courses.kafkaticketsales.domain.event;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketSalesCreatedEvent {

    private UUID id;

    private LocalDateTime dateTime;

    public TicketSalesCreatedEvent(UUID id) {
        this.id = id;
        this.dateTime = LocalDateTime.now();
    }
}
