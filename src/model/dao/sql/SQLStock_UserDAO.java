package model.dao.sql;

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
    public List<User> getAllUsers() {
        List<User> users = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM Student;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int userId = result.getInt("id");
                String name = result.getString("login");
                String email = result.getString("full_name");
                String password = result.getString("birth_date");

                users.add(new User(userId, name, email, password, 0));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public void deleteUser (String code) {
        String query = "DELETE FROM Action WHERE code = '" + code + "';";
        SQLConnector.getInstance().deleteQuery(query);
    }
}
