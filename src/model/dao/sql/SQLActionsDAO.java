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
    public void addAction (Action action) {

        String query = "INSERT INTO Action(code, name, ects) VALUES ('" +
                action.getCode() + "', '" +
                action.getName() + "', '" +
                action.getEcts() +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Action> getAllActions() {
        List<Action> actions = new LinkedList<>();
        String query = "SELECT code, name, ects FROM Course;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                String code = result.getString("code");
                String name = result.getString("name");
                int ects = result.getInt("ects");

                actions.add(new Action(code, name, ects));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actions;
    }

    @Override
    public void deleteAction (String code) {
        String query = "DELETE FROM Action WHERE code = '" + code + "';";
        SQLConnector.getInstance().deleteQuery(query);
    }

}
