package services;

import entities.User;
import java.util.ArrayList;

public interface IUserService {
    User add(User user);
    User update(User user) throws Exception;
    void delete(int id) throws Exception;
    User getById(int id) throws Exception;
    ArrayList<User> getAll();
}
