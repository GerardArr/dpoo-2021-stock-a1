package model.entity;

/**
 * The Course class represents a course managed by the system.
 *
 * The Course class holds an identifying code, as well as simple information
 * for the course such as its name and number of credits (ECTS).
 */
public class Course {
    // Attributes.
    private String code;
    private String name;
    private int ects;


    // Parametrized constructor.
    public Course(String code, String name, int ects) {
        this.code = code;
        this.name = name;
        this.ects = ects;
    }


    /**
     * Getter for the course's code.
     *
     * @return A string representation of the course's code.
     */
    public String getCode() {
        return code;
    }


    /**
     * Getter for the course's name.
     *
     * @return A string representation of the course's name.
     */
    public String getName() {
        return name;
    }


    /**
     * Getter for the course's ECTS.
     *
     * @return The course's credits (ECTS), an integer.
     */
    public int getEcts() {
        return ects;
    }


    // The toString method of the Object class, overriden.
    @Override
    public String toString() {
        return name;
    }
}
