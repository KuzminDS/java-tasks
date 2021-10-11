package services;

import entities.Doctor;
import entities.User;

import java.util.ArrayList;

public interface IDoctorService {
    Doctor add(Doctor doctor);
    Doctor update(Doctor doctor) throws Exception;
    void delete(int id) throws Exception;
    Doctor getById(int id) throws Exception;
    ArrayList<Doctor> getAll();
}
