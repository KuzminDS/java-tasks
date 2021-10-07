package dao;

import entities.Doctor;

import java.util.ArrayList;

public interface IDoctorDao {
    Doctor add(Doctor doctor);
    Doctor update(Doctor doctor) throws Exception;
    void delete(Doctor doctor) throws Exception;
    Doctor getById(int id) throws Exception;
    ArrayList<Doctor> getAll();
}
