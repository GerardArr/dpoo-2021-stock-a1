package model.dao;

import model.entity.Action;

import java.util.List;

public interface ActionsDAO {

    /**
     * Method that saves a specific course, persisting it.
     *
     * @param action The new action to save.
     */
    void addCourse(Action action);

    /**
     * Method that reads the persisted information, returning all stored actions.
     *
     * @return A list containing all persisted actions.
     */
    List<Action> getAllCourses();

    /**
     * Method that deletes a persisted action, by its code.
     *
     * @param code A string representation of the persisted actions's code.
     */
    void deleteCourse(String code);

}
