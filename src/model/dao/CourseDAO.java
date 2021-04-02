package model.dao;

import model.entity.Course;

import java.util.List;

/**
 * Interface that abstracts the persistence of groups from the rest of the code.
 *
 * In particular, it follows the Data Access Object design pattern, which is commonly used to abstract persistence
 * implementations with a set of generic operations.
 */
public interface CourseDAO {

    /**
     * Method that saves a specific course, persisting it.
     *
     * @param course The new course to save.
     */
    void addCourse(Course course);

    /**
     * Method that reads the persisted information, returning all stored courses.
     *
     * @return A list containing all persisted courses.
     */
    List<Course> getAllCourses();

    /**
     * Method that deletes a persisted course, by its code.
     *
     * @param code A string representation of the persisted course's code.
     */
    void deleteCourse(String code);
}
