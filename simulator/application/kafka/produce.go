package kafka

import (
	ticketSales "simulator/application/ticketSales"
	kafka "simulator/infrastructure/kafka"
	"os"
	"time"
)

func Produce() {
	producer := kafka.NewKafkaProducer()

	ticketSales := ticketSales.NewTicketSales()
	
	for {
		ticketSales.GerateTicketSales()

		ticketSalesJson, err := ticketSales.ExportJsonTicketSales()

		if (err == nil) {

			kafka.Publish(ticketSalesJson, os.Getenv("KafkaProduceTopic"), producer)

			time.Sleep(time.Millisecond * 15000)
		}

	}
}