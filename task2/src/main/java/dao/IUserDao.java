package dao;

import entities.User;

import java.util.ArrayList;

public interface IUserDao {
    User add(User user);
    User update(User user) throws Exception;
    void delete(User user) throws Exception;
    User getById(int id) throws Exception;
    ArrayList<User> getAll();
}
