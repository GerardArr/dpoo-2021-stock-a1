package model.entity;

public class Bot {

    // Attributes.
    private int id;
    private String login;
    private String fullName;
    private String birthDate;


    // Parametrized constructor.
    public Bot(int botId,  String login, String fullName, String birthDate) {
        this.id = botId;
        this.login = login;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }


    /**
     * Getter for the bots id.
     *
     * @return The bots id, an integer.
     */
    public int getId() {
        return id;
    }


    /**
     * Getter for the bots login.
     *
     * @return A string representation of the bots login.
     */
    public String getLogin() {
        return login;
    }


    /**
     * Getter for the bots full name.
     *
     * @return A string representation of the bots full name.
     */
    public String getFullName() {
        return fullName;
    }


    /**
     * Getter for the bots date of birth.
     *
     * @return A string representation of the bots date of birth.
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
