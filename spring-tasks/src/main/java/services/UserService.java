package services;

import dao.IUserDao;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService implements IUserService {
    @Autowired
    @Qualifier("") //
    private IUserDao userDao;

//    public UserService(IUserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public User update(User user) throws Exception {
        return userDao.update(user);
    }

    @Override
    public void delete(int id) throws Exception {
        User user = getById(id);
        userDao.delete(user);
    }

    @Override
    public User getById(int id) throws Exception {
        return userDao.getById(id);
    }

    @Override
    public ArrayList<User> getAll() {
        return userDao.getAll();
    }
}
