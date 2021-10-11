package entities;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Appointment {
    private int id;
    private int userId;
    private int doctorId;
    private Date date;
    private Session session;

    public Appointment() {}


    public Appointment(int id, int userId, int doctorId, Date date, Session session) {
        this.id = id;
        this.userId = userId;
        this.doctorId = doctorId;
        this.date = date;
        this.session = session;
    }
}
