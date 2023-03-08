package ch.makery.agenda.service;

import ch.makery.agenda.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonService {
    public ResponseEntity<?> getAllPerson();
    public ResponseEntity<?> getPersonById(String id);
    public ResponseEntity<?> getPersonByFirst(String firstName);
    //public ResponseEntity<?> getPersonByLast(String lastName);
    public ResponseEntity<?> addPerson(@RequestBody Person p);
    public ResponseEntity<?> updatePerson(@RequestBody Person edit, @PathVariable String id);
    public ResponseEntity<?> deletePerson(@PathVariable String id);
    public ResponseEntity<?> deleteAllPersons();
}
