package entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Human {
    private MedicalCard medicalCard;

    public User() {}

    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password) {
        super(id, firstName, lastName, patronymic, email, number, password);
    }

    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password, MedicalCard medicalCard) {
        super(id, firstName, lastName, patronymic, email, number, password);
        this.medicalCard = medicalCard;
    }
}
