package dev.viktor.streamingservice.adaptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"dev.viktor.streamingservice"})
@EnableJpaRepositories(basePackages = {"dev.viktor.streamingservice"})
@EntityScan(basePackages = {"dev.viktor.streamingservice"})
public class StreamingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamingServiceApplication.class, args);
    }
}