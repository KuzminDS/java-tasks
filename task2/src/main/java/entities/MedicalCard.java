package entities;

import lombok.Data;

import java.util.ArrayList;

@Data
public class MedicalCard {
    private int id;
    private ArrayList<Appointment> appointments;

    public MedicalCard() {}

    public MedicalCard(int id) {
        this.id = id;
        this.appointments = new ArrayList<>();
    }
}
