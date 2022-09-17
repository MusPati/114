package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService user = new UserServiceImpl();
    public static void main(String[] args){


        user.createUsersTable();

        user.saveUser("Vadim", "Ivanov", (byte)36);
        user.saveUser("Petr", "Yakovlev", (byte)28);
        user.saveUser("Mariya", "Popova", (byte)24);
        user.saveUser("Kseniya", "Topilina", (byte)27);

        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();

    }
}
