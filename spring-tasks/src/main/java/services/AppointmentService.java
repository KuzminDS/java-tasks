package services;

import dao.IAppointmentDao;
import entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AppointmentService implements IAppointmentService {
    @Autowired
    private IAppointmentDao appointmentDao;

    @Override
    public Appointment add(Appointment appointment) {
        return appointmentDao.add(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) throws Exception {
        return appointmentDao.update(appointment);
    }

    @Override
    public void delete(int id) throws Exception {
        Appointment appointment = appointmentDao.getById(id);
        appointmentDao.delete(appointment);
    }

    @Override
    public Appointment getById(int id) throws Exception {
        return appointmentDao.getById(id);
    }

    @Override
    public ArrayList<Appointment> getAll() {
        return appointmentDao.getAll();
    }
}
