package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.domain.event.TicketSalesCreatedEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import java.util.UUID;

@ExtendWith(OutputCaptureExtension.class)
class TicketSalesEventListenerAdapterTest {

    TicketSalesEventListenerAdapter adapter = new TicketSalesEventListenerAdapter();

    @Test
    public void testHandle(CapturedOutput output) {
        // Arrange
        TicketSalesCreatedEvent event = new TicketSalesCreatedEvent(UUID.randomUUID());
        String infoTestMessage = "Ticket Sales created with id " + event.getId() + " at " + event.getDateTime();

        // Action
        adapter.handle(event);

        // Assertion
        Assertions.assertTrue(output.getOut().contains(infoTestMessage));
    }
}