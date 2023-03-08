package ch.makery.agenda.config;

import ch.makery.agenda.model.Person;
import ch.makery.agenda.model.PersonRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Tras descomentar la funcion en esta clase, insertara datos predefinidos
 * en la base de datos al iniciar la aplicacion. Si hay datos con el mismo
 * ID que estos datos, seran sobreescritos.
 */

@Slf4j
@Component
public class DatabaseInit {
	@Autowired
    public PersonRepository repository;

	/*@PostConstruct
	public void createData() {
        Person p1 = new Person("Placeholder-01","Angel-01","Woo","Sevilla","Andalucia",12345, LocalDate.of(2000, 12, 8));
        Person p2 = new Person("Placeholder-02","Angel-02","Castillo","Sevilla","Andalucia",87260, LocalDate.of(2001, 12, 7));
        Person p3 = new Person("Placeholder-03","Angel-03","LeWoo","Sevilla","Andalucia",78661, LocalDate.of(2002, 7, 6));
        Person p4 = new Person("Placeholder-04","Angel-04","KXV","Sevilla","Andalucia",46141, LocalDate.of(2000, 4, 3));
        Person p5 = new Person("Placeholder-05","Angel-05","K-15","Sevilla","Andalucia",95799, LocalDate.of(2022, 12, 8));
        log.info("Inserting demo data...");
        repository.save(p1); repository.save(p2);
        repository.save(p3); repository.save(p4);
        repository.save(p5);
	}*/
}