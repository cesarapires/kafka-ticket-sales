package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event.TicketSalesWasReceived;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TicketSalesKafkaEventListenerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketSalesKafkaEventListenerAdapter.class);

    @EventListener
    public void handle(TicketSalesWasReceived event) {
        LOGGER.info("Ticket Sales was received at " + event.getDateTime());
    }
}
