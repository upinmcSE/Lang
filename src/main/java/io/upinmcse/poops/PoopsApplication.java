package io.upinmcse.poops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PoopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoopsApplication.class, args);
    }

}
