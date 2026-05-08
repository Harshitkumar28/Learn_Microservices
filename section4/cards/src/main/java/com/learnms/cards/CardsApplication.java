package com.learnms.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Blood Bank Cards Microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Harshit Kumar",
						email = "harshitmail@bloodbank.com",
						url = "https://www.harshitwebsite.com"
				),
				license = @License(
						name = "MS 1.0",
						url = "https://www.harshitwebsite.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Blood Bank Cards Microservice REST API Documentation",
				url = "https://www.harshitwebsite.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}