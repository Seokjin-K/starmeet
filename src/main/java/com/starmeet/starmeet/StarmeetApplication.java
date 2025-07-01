package com.starmeet.starmeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StarmeetApplication {

  public static void main(String[] args) {
    SpringApplication.run(StarmeetApplication.class, args);
  }
}
