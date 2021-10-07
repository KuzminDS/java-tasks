package dao.fake;

import dao.IAppointmentDao;
import entities.Appointment;
import entities.Doctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AppointmentDao implements IAppointmentDao {
    private static Map<Integer, Appointment> appointments;

    static {
        appointments = new HashMap<>();
    }

    @Override
    public Appointment add(Appointment appointment) {
        var id = appointments.keySet().stream().mapToInt(v -> v).max().getAsInt() + 1;
        appointment.setId(id);
        appointments.put(id, appointment);
        return appointment;
    }

    @Override
    public Appointment update(Appointment appointment) throws Exception {
        if (!appointments.containsKey(appointment.getId())) {
            throw new Exception("Appointment with id " + appointment.getId() + " does not exist");
        }
        appointments.replace(appointment.getId(), appointment);
        return appointment;
    }

    @Override
    public void delete(Appointment appointment) throws Exception {
        if (!appointments.containsKey(appointment.getId())) {
            throw new Exception("Appointment with id " + appointment.getId() + " does not exist");
        }
        appointments.remove(appointment.getId());
    }

    @Override
    public Appointment getById(int id) throws Exception {
        if (!appointments.containsKey(id)) {
            throw new Exception("Appointment with id " + id + " does not exist");
        }
        return appointments.get(id);
    }

    @Override
    public ArrayList<Appointment> getAll() {
        return new ArrayList<>(appointments.values());
    }
}
