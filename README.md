# kafka-ticket-sales

This repository is a learning resource for studying Kafka with Java in the context of a ticket sales system. It provides examples and code to help you understand how Kafka works and how it can be used in real-world applications.

By exploring the code and examples in this repository, you can learn about Kafka's event-driven architecture and how to produce and consume events. It's a great opportunity to gain practical experience and learn best practices for integrating Kafka with Java.

Feel free to explore the code, experiment with different configurations, and refer to the provided documentation. This repository is designed to help you understand Kafka and apply it to build scalable and resilient event-driven systems.

Join us on this learning journey and discover the power of Kafka in building efficient and reliable applications!

Let me know if there's anything else I can assist you with.

## Prerequisites

Before running this project, make sure you have the following prerequisites installed:

 * Docker: The project is designed to run within a Docker container, so Docker needs to be installed on your system. You can download and install Docker from the official website: https://www.docker.com/get-started

## Getting Started

To get started with this project, follow the steps below:

1. Clone the repository:
```bash
git clone git@github.com:cesarapires/kafka-ticket-sales.git
```

2. Build the Docker image:
```bash
docker build -t kafka-ticket-sales .
```
3. Run the Docker container:
```bash
docker compose up -d
```

4. Access the application:

Open your web browser and visit http://localhost:8080 to access the running application.

 ## License
This project is licensed under the Apache License 2.0. See the [LICENSE](LICENSE) file for details.
