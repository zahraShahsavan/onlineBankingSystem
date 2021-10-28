package com.corebank.zac.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.corebank.zac.main.repository")
@EntityScan("com.corebank.zac.main.model")
@SpringBootApplication
public class ZacApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZacApplication.class, args);
    }

}
