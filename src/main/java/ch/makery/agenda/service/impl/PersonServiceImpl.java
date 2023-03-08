package ch.makery.agenda.service.impl;

import ch.makery.agenda.dto.PersonDTO;
import ch.makery.agenda.dto.converter.PersonDTOConverter;
import ch.makery.agenda.model.Person;
import ch.makery.agenda.model.PersonRepository;
import ch.makery.agenda.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonDTOConverter converter;
    private final PersonRepository repository;

    // GET
    @Override
    public ResponseEntity<?> getAllPerson() {
        List<Person> result = repository.findAll();
        if (result.isEmpty()) return ResponseEntity.notFound().build();
        else {
            List<PersonDTO> dtoList = result.stream().map(converter::convertToDTO).collect(Collectors.toList());
            return ResponseEntity.ok(dtoList);
        }
    }

    @Override
    public ResponseEntity<?> getPersonById(String id) {
        Person result = repository.findById(id).orElse(null);
        if (result == null) return ResponseEntity.notFound().build();
        else return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<?> getPersonByFirst(String firstName) {
        List<Person> result = repository.findByFirstNameContaining(firstName);
        if (result == null) return ResponseEntity.notFound().build();
        else {
            List<PersonDTO> dtoList = result.stream().map(converter::convertToDTO).collect(Collectors.toList());
            return ResponseEntity.ok(dtoList);
        }
    }

    // POST
    @Override
    public ResponseEntity<?> addPerson(Person p) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(p));
    }

    // PUT
    @Override
    public ResponseEntity<?> updatePerson(Person edit, String id) {
        return repository.findById(id).map(u -> {
            u.setFirstName(edit.getFirstName());
            u.setLastName(edit.getLastName());
            u.setStreet(edit.getStreet());
            u.setCity(edit.getCity());
            u.setPostalCode(edit.getPostalCode());
            u.setBirthday(edit.getBirthday());
            return ResponseEntity.ok(repository.save(u));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE
    @Override
    public ResponseEntity<?> deletePerson(String id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<?> deleteAllPersons() {
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
