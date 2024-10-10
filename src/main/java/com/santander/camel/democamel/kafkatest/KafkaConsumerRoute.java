package com.santander.camel.democamel.kafkatest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("kafka:compraventatrftopic?brokers=localhost:9092")
                .log("Mensaje recibido de Kafka: ${body}");
    }
}