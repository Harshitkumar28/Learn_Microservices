package com.learnms.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// below three commeneted out annotations is there to specify to spring boot where our controllers or models etc. are/
// here, it is not needed as our project is following standard file structure, it is for the case when file structure is customized and not standard one.

@SpringBootApplication
//@ComponentScans({@ComponentScan("com.learnms.newaccounts.controller")})
//@EnableJpaRepositories("com.learms.newaccounts.repository")
//@EntityScan("com.learnms.newaccounts.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "Harshit's Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Harshit Kumar",
						email = "abc@email.com",
						url = "https://www.harsitwebsite.com"
				),
				license = @License(
						name = "MS 1.0",
						url = "https://www.harshitwebsite.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Harshit's Accounts microservice REST API Documentation",
				url = "https://www.harshitwebsite.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
