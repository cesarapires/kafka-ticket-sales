package com.courses.kafkaticketsales.infrastructure.adapters.input.eventListener;

import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event.TicketSalesWasReceived;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import java.util.UUID;

@ExtendWith(OutputCaptureExtension.class)
class TicketSalesKafkaEventListenerAdapterTest {

    TicketSalesKafkaEventListenerAdapter adapter = new TicketSalesKafkaEventListenerAdapter();

    @Test
    public void testHandle(CapturedOutput output) {
        // Arrange
        TicketSalesWasReceived event = new TicketSalesWasReceived();
        String infoTestMessage = "Ticket Sales was received at " + event.getDateTime();

        // Action
        adapter.handle(event);

        // Assertion
        Assertions.assertTrue(output.getOut().contains(infoTestMessage));
    }
}