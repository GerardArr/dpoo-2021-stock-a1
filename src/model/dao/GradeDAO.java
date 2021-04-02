package model.dao;

import model.entity.Grade;

import java.util.List;

/**
 * Interface that abstracts the persistence of grades from the rest of the code.
 *
 * In particular, it follows the Data Access Object design pattern, which is commonly used to abstract persistence
 * implementations with a set of generic operations.
 */
public interface GradeDAO {

    /**
     * Method that persists a grade, assigning it to a specific student and course, by their
     * respective numeric id and alphanumeric code.
     *
     * @param studentId The student's numeric id.
     * @param courseCode The course's alphanumeric code.
     * @param grade The grade to assign.
     */
    void addGrade(int studentId, String courseCode, int grade);

    /**
     * Method that reads the persisted information, returning all stored grades for a student.
     *
     * @param studentId The id corresponding to the student being queried.
     * @return A list containing all grades for the student.
     */
    List<Grade> getGradesOfStudent(int studentId);

}
