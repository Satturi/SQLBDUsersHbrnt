package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;


public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {
        userService.createUsersTable();

        userService.saveUser("Роман", "Меркулов", (byte) 18);
        userService.saveUser("Тля", "Молозернов", (byte) 55);
        userService.saveUser("Константин", "Селезнюк", (byte) 35);
        userService.saveUser("Гриша", "Палыч", (byte) 8);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
