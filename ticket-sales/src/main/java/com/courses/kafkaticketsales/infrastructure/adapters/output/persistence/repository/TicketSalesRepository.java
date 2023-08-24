package com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.repository;

import com.courses.kafkaticketsales.infrastructure.adapters.output.persistence.entity.TicketSalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TicketSalesRepository extends JpaRepository<TicketSalesEntity, UUID> {
}
