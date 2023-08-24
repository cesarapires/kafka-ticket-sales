package com.courses.kafkaticketsales.application.ports.output;

import com.courses.kafkaticketsales.application.event.TicketSalesEvent;

public interface TicketSalesEventPublisher {

    void publishTicketSalesCreatedEvent(TicketSalesEvent event);

}
