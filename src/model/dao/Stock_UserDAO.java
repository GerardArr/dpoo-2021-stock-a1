package model.dao;

import model.entity.User;

import java.util.List;

public interface Stock_UserDAO {
    /**
     * Method that saves a specific course, persisting it.
     *
     * @param user The new action to save.
     */
    void addUser(User user);

    /**
     * Method that reads the persisted information, returning all stored actions.
     *
     * @return A list containing all persisted actions.
     */
    List<User> getAllUsers();

    /**
     * Method that deletes a persisted action, by its code.
     *
     * @param code A string representation of the persisted actions's code.
     */
    void deleteUser(String code);
}
