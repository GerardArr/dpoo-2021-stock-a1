package model.dao.sql;

import model.dao.StudentDAO;
import model.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Class that implements the methods described in the {@link StudentDAO} interface.
 *
 * Specifically, it implements the student persistence in a SQL database.
 */
public class SQLStudentDAO implements StudentDAO {

    @Override
    public void addStudent(Student student) {
        String query = "INSERT INTO Student(id, login, full_name, birth_date) VALUES ('" +
            student.getId() + "', '" +
            student.getLogin() + "', '" +
            student.getFullName() + "', '" +
            student.getBirthDate() +
        "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM Student;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int id = result.getInt("id");
                String login = result.getString("login");
                String studentName = result.getString("full_name");
                String birthDate = result.getString("birth_date");

                students.add(new Student(id, login, studentName, birthDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
