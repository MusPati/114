package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao usdHt = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() throws SQLException {
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

//    UserDao usd = new UserDaoJDBCImpl();
//
//    public void createUsersTable() throws SQLException {
//    usd.createUsersTable();
//    }
//
//    public void dropUsersTable() {
//    usd.dropUsersTable();
//    }
//
//    public void saveUser(String name, String lastName, byte age) {
//    usd.saveUser(name, lastName, age);
//        System.out.println("User с именем - " + name + " добавлен в базу данных.");
//    }
//
//    public void removeUserById(long id) {
//    usd.removeUserById(id);
//    }
//
//    public List<User> getAllUsers() {
//        List<User> users =  usd.getAllUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        return users;
//    }
//
//    public void cleanUsersTable() {
//    usd.cleanUsersTable();
//    }
//}
