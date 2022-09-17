package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao usdHt = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        usdHt.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        usdHt.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        usdHt.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных.");
    }

    @Override
    public void removeUserById(long id) {
        usdHt.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = usdHt.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    @Override
    public void cleanUsersTable() {
        usdHt.cleanUsersTable();
    }
}
