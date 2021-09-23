package services;

import dao.StudentDao;
import entities.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsService {

    public List<Student> getStudents() {
        return StudentDao.getStudents();
    }

    public List<Student> getExcellentStudents() {
        return StudentDao.getStudents().stream().filter(s -> s.getAverageScore() >= 4.0).collect(Collectors.toList());
    }

    public List<Student> getBlockchainStudents() {
        return StudentDao.getStudents().stream().filter(s -> s.getIsBlockchain()).collect(Collectors.toList());
    }

    public void addStudent(Student student) {
        StudentDao.addStudent(student);
    }

    public boolean exists(String studentName) {
        return StudentDao.getStudents().stream().anyMatch(s -> s.getName().equals(studentName));
    }
}
