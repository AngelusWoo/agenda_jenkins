package ch.makery.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ch.makery"})
public class AgendaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}
}
