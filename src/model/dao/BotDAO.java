package model.dao;

import model.entity.Bot;

import java.util.List;

public interface BotDAO {

    /**
     * Method that saves a specific student, persisting it.
     *
     * @param bot The new bot to save.
     */
    void addStudent(Bot bot);

    /**
     * Method that reads the persisted information, returning all stored students.
     *
     * @return A list containing all persisted students.
     */
    List<Bot> getAllStudents();

}
