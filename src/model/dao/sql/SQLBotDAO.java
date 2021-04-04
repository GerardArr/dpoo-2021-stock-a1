package model.dao.sql;

import model.dao.BotDAO;
import model.entity.Bot;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SQLBotDAO implements BotDAO {

    @Override
    public void addBot(Bot bot) {
        String query = "INSERT INTO Bot(id, login, full_name, birth_date) VALUES ('" +
                bot.getId() + "', '" +
                bot.getLogin() + "', '" +
                bot.getFullName() + "', '" +
                bot.getBirthDate() +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Bot> getAllBots() {
        List<Bot> students = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM Bot;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String login = result.getString("login");
                String studentName = result.getString("full_name");
                String birthDate = result.getString("birth_date");

                students.add(new Bot(id, login, studentName, birthDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
