package model.dao.sql;

import model.dao.CourseDAO;
import model.entity.Course;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Class that implements the methods described in the {@link CourseDAO} interface.
 *
 * Specifically, it implements the course persistence in a SQL database.
 */
public class SQLCourseDAO implements CourseDAO {
    @Override
    public void addCourse(Course course) {

        String query = "INSERT INTO Course(code, name, ects) VALUES ('" +
            course.getCode() + "', '" +
            course.getName() + "', '" +
            course.getEcts() +
        "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Course> getAllCourses() {
        List<Course> courses = new LinkedList<>();
        String query = "SELECT code, name, ects FROM Course;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                String code = result.getString("code");
                String name = result.getString("name");
                int ects = result.getInt("ects");

                courses.add(new Course(code, name, ects));
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
