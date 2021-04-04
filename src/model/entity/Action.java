package model.entity;

public class Action {
    // Attributes.
    private String code;
    private String name;
    private int ects;


    // Parametrized constructor.
    public Action(String code, String name, int ects) {
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
     * Getter for the action's name.
     *
     * @return A string representation of the action's name.
     */
    public String getName() {
        return name;
    }


    /**
     * Getter for the action's ECTS.
     *
     * @return The action's credits (ECTS), an integer.
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
