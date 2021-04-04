package model.entity;

public class User {

    // Attributes.
    private int user_id;
    private String name;
    private String email;
    private String password;
    private float cash;


    // Parametrized constructor.
    public User(int userId,  String name, String email, String password, float cash) {
        this.user_id = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cash = cash;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int userId) {
        this.user_id = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }
}

