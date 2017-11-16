package fr.afpa.filRouge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import fr.afpa.filRouge.controller.AppController;

@SpringBootApplication
@ComponentScan(basePackageClasses=AppController.class)
public class OpenOutingsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenOutingsSpringBootApplication.class, args);
	}
}
