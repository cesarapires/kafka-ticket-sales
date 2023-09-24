package com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event;

import com.courses.kafkaticketsales.application.event.TicketSalesEvent;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class TicketSalesWasReceived implements TicketSalesEvent {

    private LocalDateTime dateTime;

    public TicketSalesWasReceived() {
        this.dateTime = LocalDateTime.now();
    }
}
