package entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.print.Doc;

@EqualsAndHashCode(callSuper = true)
@Data
public class Doctor extends Human {

    public enum Position {
        Therapist,
        Dentist
    }

    private Position position;

    public Doctor() {}

    public Doctor(int id, String firstName, String lastName, String patronymic, String email, String number, String password, Position position) {
        super(id, firstName, lastName, patronymic, email, number, password);
        this.position = position;
    }
}
