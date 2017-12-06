package fr.afpa.filRouge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import fr.afpa.filRouge.controller.IndexController;

@SpringBootApplication
@ComponentScan("fr.afpa.filRouge")
public class OpenOutingsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenOutingsSpringBootApplication.class, args);
	}
}
