package kafka

import (
	"fmt"
	ckafka "github.com/confluentinc/confluent-kafka-go/v2/kafka"
	"os"
)

func NewKafkaProducer() *ckafka.Producer {
	configMap := &ckafka.ConfigMap {
		"bootstrap.servers": os.Getenv("KafkaBootstrapServers"),
	}

	producer, err := ckafka.NewProducer(configMap)

	if  err != nil {
		fmt.Println(err)
		return nil
	}

	return producer
}

func Publish(msg string, topic string, producer *ckafka.Producer) error {
	fmt.Println(msg)
	
	message := &ckafka.Message {
		TopicPartition: ckafka.TopicPartition{Topic: &topic, Partition: ckafka.PartitionAny},
		Value: []byte(msg),
	}

	err := producer.Produce(message, nil)

	if err != nil {
		return err
	}

	return nil
}