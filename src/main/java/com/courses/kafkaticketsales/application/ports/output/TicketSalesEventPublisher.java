package com.courses.kafkaticketsales.application.ports.output;

import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;

public interface TicketSalesEventPublisher {

    void publishTicketSalesCreatedEvent(TicketSalesCreatedEvent event);

}
