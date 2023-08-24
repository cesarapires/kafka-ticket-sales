package com.courses.kafkaticketsales.infrastructure.adapters.input.consumer;

import com.courses.kafkaticketsales.application.ports.input.TicketSalesServiceInterface;
import com.courses.kafkaticketsales.application.ports.output.TicketSalesEventPublisher;
import com.courses.kafkaticketsales.domain.model.ticketSales.TicketSales;
import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.data.TicketSalesCreatePayload;
import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.event.TicketSalesWasReceived;
import com.courses.kafkaticketsales.infrastructure.adapters.input.consumer.mapper.TicketSalesConsumerMapper;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TicketSalesConsumerAdapter {

    private final TicketSalesServiceInterface ticketSalesService;

    private final TicketSalesEventPublisher ticketSalesEventPublisher;

    private final TicketSalesConsumerMapper ticketSalesConsumerMapper;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload) {
        ticketSalesEventPublisher.publishTicketSalesCreatedEvent( new TicketSalesWasReceived());

        Gson gson = new Gson();

        TicketSalesCreatePayload ticketSalesCreatePayload = gson.fromJson(payload.value(), TicketSalesCreatePayload.class);

        TicketSales ticketSales = ticketSalesConsumerMapper.toTicketSales(ticketSalesCreatePayload);

        ticketSalesService.addTicketSales(ticketSales);
    }
}
