package com.courses.kafkaticketsales.infrastructure.adapters.output.eventPublisher;

import com.courses.kafkaticketsales.application.event.TicketSalesEvent;
import com.courses.kafkaticketsales.application.ports.output.TicketSalesEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
public class TicketSalesEventPublisherAdapter implements TicketSalesEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publishTicketSalesCreatedEvent(TicketSalesEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
