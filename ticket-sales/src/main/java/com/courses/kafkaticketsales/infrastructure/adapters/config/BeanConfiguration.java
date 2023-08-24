package com.courses.kafkaticketsales.infrastructure.adapters.config;

import com.courses.kafkaticketsales.application.ports.output.TicketSalesEventPublisher;
import com.courses.kafkaticketsales.application.ports.output.TicketSalesOutputPort;
import com.courses.kafkaticketsales.domain.service.TicketSalesService;
import com.courses.kafkaticketsales.infrastructure.adapters.output.eventPublisher.TicketSalesEventPublisherAdapter;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.TicketSalesPersistenceAdapter;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.mapper.TicketSalesPersistenceMapper;
import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.repository.TicketSalesRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public TicketSalesPersistenceAdapter ticketSalesPersistenceAdapter(
            TicketSalesRepository ticketSalesRepository,
            TicketSalesPersistenceMapper ticketSalesPersistenceMapper
    ) {
        return new TicketSalesPersistenceAdapter(ticketSalesRepository, ticketSalesPersistenceMapper);
    }

    @Bean
    public TicketSalesEventPublisherAdapter ticketSalesEventPublisherAdapter(
            ApplicationEventPublisher applicationEventPublisher
    ) {
        return new TicketSalesEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    public TicketSalesService ticketSalesService(
            TicketSalesPersistenceAdapter ticketSalesPersistenceAdapter,
            TicketSalesEventPublisherAdapter ticketSalesEventPublisherAdapter
    ) {
        return new TicketSalesService(ticketSalesPersistenceAdapter, ticketSalesEventPublisherAdapter);
    }
}
