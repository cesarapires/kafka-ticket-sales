package com.courses.kafkaticketsales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaTicketSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTicketSalesApplication.class, args);
	}

}
