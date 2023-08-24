package com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event;

import com.courses.kafkaticketsales.application.event.TicketSalesEvent;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class TicketSalesWasReceived implements TicketSalesEvent {
    private UUID id;

    private LocalDateTime dateTime;

    public TicketSalesWasReceived(UUID id) {
        this.id = id;
        this.dateTime = LocalDateTime.now();
    }

    public TicketSalesWasReceived() {
        this.dateTime = LocalDateTime.now();
    }
}
