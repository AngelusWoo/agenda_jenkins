package ch.makery.agenda.dto.converter;

import ch.makery.agenda.dto.PersonDTO;
import ch.makery.agenda.model.Person;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonDTOConverter {
    private final ModelMapper modelMapper;
    public PersonDTO convertToDTO(Person person) {
        return modelMapper.map(person, PersonDTO.class);
    }
}
