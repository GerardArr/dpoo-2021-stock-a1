package model.dao.sql;

import model.dao.GradeDAO;
import model.entity.Course;
import model.entity.Grade;
import model.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Class that implements the methods described in the {@link GradeDAO} interface.
 *
 * Specifically, it implements the grade persistence in a SQL database.
 */
public class SQLGradeDAO implements GradeDAO {
    @Override
    public void addGrade(int studentId, String courseCode, int grade) {
        String query = "INSERT INTO Grade(student_id, course_code, grade) VALUES (" +
            studentId + ", '" +
            courseCode + "', " +
            grade +
        ");";
        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Grade> getGradesOfStudent(int studentId) {
        LinkedList<Grade> grades = new LinkedList<>();
        String query = "SELECT s.login, s.full_name, s.birth_date, g.grade, c.code, c.ects, c.name FROM Student AS s, Grade AS g, Course AS c " +
                "WHERE s.id = g.student_id AND c.code = g.course_code AND s.id = " + studentId + ";";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try{
            while (result.next()) {
                String login = result.getString(1);
                String studentName = result.getString(2);
                String birthDate = result.getString(3);

                int gradeValue = result.getInt(4);

                String code = result.getString(5);
                int ects = result.getInt(6);
                String name = result.getString(7);

                Student student = new Student(studentId, studentName, login, birthDate);
                Course course = new Course(code, name, ects);
                grades.add(new Grade(student, course, gradeValue));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grades;
    }
}
