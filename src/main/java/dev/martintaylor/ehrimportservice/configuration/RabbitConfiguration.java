package dev.martintaylor.ehrimportservice.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RabbitConfiguration {
    private final String inboundQueueName;

    public RabbitConfiguration(@Value("${mhs.inbound.queue-name}") String inboundQueueName) {
        this.inboundQueueName = inboundQueueName;
    }

    @Bean
    Queue queue() {
        return new Queue(inboundQueueName);
    }
}