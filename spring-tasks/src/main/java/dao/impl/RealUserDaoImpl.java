package dao.impl;

import dao.IUserDao;
import entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RealUserDaoImpl implements IUserDao {

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User update(User user) throws Exception {
        return null;
    }

    @Override
    public void delete(User user) throws Exception {

    }

    @Override
    public User getById(int id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return null;
    }
}
