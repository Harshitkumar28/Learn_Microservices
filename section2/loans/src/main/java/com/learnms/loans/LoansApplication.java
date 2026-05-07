package com.learnms.loans;

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
				title = "Loans microservice REST API Documentation",
				description = "BloodBank Loan microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Harshit Kumar",
						email = "harshitmail@bloodbank.com",
						url = "https://www.harsitwebsite.com"
				),
				license = @License(
						name = "MS 1.0",
						url = "https://www.harshitwebsite.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "BloodBank Loans microservice REST API Documentation",
				url = "https://www.harshitwebsite.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
