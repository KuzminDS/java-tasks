package services;

import dao.IDoctorDao;
import entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DoctorService implements IDoctorService {
    @Autowired
    private IDoctorDao doctorDao;

    @Override
    public Doctor add(Doctor doctor) {
        return doctorDao.add(doctor);
    }

    @Override
    public Doctor update(Doctor doctor) throws Exception {
        return doctorDao.update(doctor);
    }

    @Override
    public void delete(int id) throws Exception {
        var doctor = getById(id);
        doctorDao.delete(doctor);
    }

    @Override
    public Doctor getById(int id) throws Exception {
        return doctorDao.getById(id);
    }

    @Override
    public ArrayList<Doctor> getAll() {
        return doctorDao.getAll();
    }
}
