package ch.makery.agenda.model;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByFirstNameContaining(String firstName);
    //List<Person> findByLastContaining(String lastName);
}
