package fr.afpa.filRouge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("fr.afpa.filRouge")
@EntityScan("fr.afpa.filRouge")
public class OpenOutingsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenOutingsSpringBootApplication.class, args);
	}
}
