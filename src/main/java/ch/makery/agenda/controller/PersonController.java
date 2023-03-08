package ch.makery.agenda.controller;

import ch.makery.agenda.model.Person;
import ch.makery.agenda.service.impl.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class PersonController {
    private final PersonServiceImpl service;

    // GET
    @GetMapping("/agenda")
    public ResponseEntity<?> getAllPerson() {
        return service.getAllPerson();
    }
    @GetMapping("/agenda/id/{id}")
    public ResponseEntity<?> getPersonById(@PathVariable String id){return service.getPersonById(id);}
    @GetMapping("/agenda/name/{firstName}")
    public ResponseEntity<?> getPersonByFirst(@PathVariable String firstName){return service.getPersonByFirst(firstName);}

    // POST
    @PostMapping("/agenda")
    public ResponseEntity<?> addPerson(@RequestBody Person p) {
        return service.addPerson(p);
    }

    // PUT
    @PutMapping("/agenda/id/{id}")
    public ResponseEntity<?> updatePerson(@RequestBody Person edit, @PathVariable String id) {
        return service.updatePerson(edit,id);
    }

    // DELETE
    @DeleteMapping("/agenda/id/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable String id) {
        return service.deletePerson(id);
    }
    @DeleteMapping("/agenda/clearAll")
    public ResponseEntity<?> deleteAllPersons() {
        return service.deleteAllPersons();
    }
}
