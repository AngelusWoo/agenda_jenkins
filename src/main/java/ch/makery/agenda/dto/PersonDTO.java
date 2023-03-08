package ch.makery.agenda.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class PersonDTO {
    private String id;
    private String firstName,lastName,street,city;
    private Integer postalCode;
    private LocalDate birthday;
}
