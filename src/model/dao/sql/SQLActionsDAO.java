package model.dao.sql;

import model.dao.ActionsDAO;
import model.entity.Action;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SQLActionsDAO implements ActionsDAO {

    @Override
    public void addCourse(Action action) {

        String query = "INSERT INTO Action(code, name, ects) VALUES ('" +
                action.getCode() + "', '" +
                action.getName() + "', '" +
                action.getEcts() +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Action> getAllCourses() {
        List<Action> courses = new LinkedList<>();
        String query = "SELECT code, name, ects FROM Course;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                String code = result.getString("code");
                String name = result.getString("name");
                int ects = result.getInt("ects");

                courses.add(new Action(code, name, ects));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    @Override
    public void deleteCourse(String code) {
        String query = "DELETE FROM Course WHERE code = '" + code + "';";
        SQLConnector.getInstance().deleteQuery(query);
    }

}
