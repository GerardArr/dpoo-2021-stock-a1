package model.entity;

public class Company {
    // Attributes.
    private int company_id;
    private String name;
    private String category;
    private float actual_value;
    private float initial_value;


    // Parametrized constructor.
    public Company(int company_id,  String name, String category, float actual_value, float initial_value) {
        this.company_id = company_id;
        this.name = name;
        this.category = category;
        this.actual_value = actual_value;
        this.initial_value = initial_value;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getActual_value() {
        return actual_value;
    }

    public void setActual_value(float actual_value) {
        this.actual_value = actual_value;
    }

    public float getInitial_value() {
        return initial_value;
    }

    public void setInitial_value(float initial_value) {
        this.initial_value = initial_value;
    }
}
