package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;
import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event.TicketSalesWasReceived;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TicketSalesKafkaEventListenerAdapter {

    @EventListener
    public void handle(TicketSalesWasReceived event) {
        log.info("Ticket Sales was received at " + event.getDateTime());
    }
}
