package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl usd = new UserDaoJDBCImpl();

    public void createUsersTable() {
    usd.createUsersTable();
    }

    public void dropUsersTable() {
    usd.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
    usd.saveUser(name, lastName, age);
        System.out.println("User с именем - " + name + " добавлен в базу данных.");
    }

    public void removeUserById(long id) {
    usd.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users =  usd.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
    usd.cleanUsersTable();
    }
}
