package model.dao;

import model.entity.Student;

import java.util.List;

/**
 * Interface that abstracts the persistence of students from the rest of the code.
 *
 * In particular, it follows the Data Access Object design pattern, which is commonly used to abstract persistence
 * implementations with a set of generic operations.
 */
public interface StudentDAO {

    /**
     * Method that saves a specific student, persisting it.
     *
     * @param student The new student to save.
     */
    void addStudent(Student student);

    /**
     * Method that reads the persisted information, returning all stored students.
     *
     * @return A list containing all persisted students.
     */
    List<Student> getAllStudents();
}
