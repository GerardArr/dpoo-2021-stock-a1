package model.entity;

/**
 * The Grade class represents a student's grade in a course.
 *
 * The Grade class holds both the student and the course, but also the
 * resulting grade.
 */
public class Grade {
    // Attributes
    private Student student;
    private Course course;
    private int value;


    // Parametrized constructor.
    public Grade(Student student, Course course, int value) {
        this.student = student;
        this.course = course;
        this.value = value;
    }


    // The toString method of the Object class, overriden.
    @Override
    public String toString() {
        return course.getName() + " (" + value + ")";
    }
}