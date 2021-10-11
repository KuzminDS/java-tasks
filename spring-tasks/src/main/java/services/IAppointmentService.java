package services;

import entities.Appointment;

import java.util.ArrayList;

public interface IAppointmentService {
    Appointment add(Appointment appointment);
    Appointment update(Appointment appointment) throws Exception;
    void delete(int id) throws Exception;
    Appointment getById(int id) throws Exception;
    ArrayList<Appointment> getAll();
}
