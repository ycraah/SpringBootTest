package com.ycraah.springboot241023;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;


@SpringBootApplication
public class SpringBoot241023Application implements CommandLineRunner {
  private static final Logger log = LoggerFactory.getLogger(SpringBoot241023Application.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot241023Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    User user = new User("root", "root");
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    Set<ConstraintViolation<User>> violations = validator.validate(user);
    violations.forEach(constraintViolation -> log.error(constraintViolation.getMessage()));
  }
}

