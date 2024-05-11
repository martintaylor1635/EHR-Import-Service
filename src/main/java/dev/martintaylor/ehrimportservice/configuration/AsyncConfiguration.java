package dev.martintaylor.ehrimportservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@EnableAsync
@Configuration
class AsyncConfiguration {
    @Bean
    Executor executor() {
        return Executors.newVirtualThreadPerTaskExecutor();
    }
}