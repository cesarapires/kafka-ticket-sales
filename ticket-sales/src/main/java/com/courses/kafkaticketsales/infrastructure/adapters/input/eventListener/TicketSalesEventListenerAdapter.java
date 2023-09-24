package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TicketSalesEventListenerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketSalesEventListenerAdapter.class);

    @EventListener
    public void handle(TicketSalesCreatedEvent event) {
        LOGGER.info("Ticket Sales created with id " + event.getId() + " at " + event.getDateTime());
    }
}
