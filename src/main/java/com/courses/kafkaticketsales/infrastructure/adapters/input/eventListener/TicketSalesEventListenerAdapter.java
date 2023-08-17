package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TicketSalesEventListenerAdapter {

    @EventListener
    public void handle(TicketSalesCreatedEvent event) {
        log.info("Ticket Sales created with id " + event.getId() + " at " + event.getDateTime());
    }
}
