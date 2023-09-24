package com.courses.kafkaticketsales.domain.event;

import com.courses.kafkaticketsales.application.event.TicketSalesEvent;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class TicketSalesCreatedEvent implements TicketSalesEvent {

    private UUID id;

    private LocalDateTime dateTime;

    public TicketSalesCreatedEvent(UUID id) {
        this.id = id;
        this.dateTime = LocalDateTime.now();
    }
}
