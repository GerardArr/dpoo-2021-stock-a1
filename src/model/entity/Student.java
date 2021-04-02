package model.entity;

/**
 * The Student class represents a student managed by the system.
 *
 * The Student class holds an identifier, as well as simple information
 * for the student such as their login, full name and date of birth.
 */
public class Student {
    // Attributes.
    private int id;
    private String login;
    private String fullName;
    private String birthDate;


    // Parametrized constructor.
    public Student(int studentId,  String login, String fullName,String birthDate) {
        this.id = studentId;
        this.login = login;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }


    /**
     * Getter for the student's id.
     *
     * @return The student's id, an integer.
     */
    public int getId() {
        return id;
    }


    /**
     * Getter for the student's login.
     *
     * @return A string representation of the student's login.
     */
    public String getLogin() {
        return login;
    }


    /**
     * Getter for the student's full name.
     *
     * @return A string representation of the student's full name.
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Getter for the student's date of birth.
     *
     * @return A string representation of the student's date of birth.
     */
    public String getBirthDate() {
        return birthDate;
    }


    // The toString method of the Object class, overriden.
    @Override
    public String toString() {
        return fullName + " (" + login + ")";
    }
}
