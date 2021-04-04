package model.dao.sql;

import model.dao.Stock_UserDAO;
import model.dao.Stock_UserDAO;
import model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SQLStock_UserDAO implements Stock_UserDAO {

    @Override
    public void addUser(User user) {
        String query = "INSERT INTO Student(id, login, full_name, birth_date) VALUES ('" +
                user.getUserId () + "', '" +
                user.getName() + "', '" +
                user.getEmail() + "', '" +
                user.getPassword() +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<User> getAllStudents() {
        List<User> user = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM Student;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int userId = result.getInt("id");
                String name = result.getString("login");
                String email = result.getString("full_name");
                String password = result.getString("birth_date");

                user.add(new User(userId, name, email, password, 1000));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
