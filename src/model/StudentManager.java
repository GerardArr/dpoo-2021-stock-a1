package model;

import model.dao.CourseDAO;
import model.dao.GradeDAO;
import model.dao.StudentDAO;
import model.dao.sql.SQLCourseDAO;
import model.dao.sql.SQLGradeDAO;
import model.dao.sql.SQLStudentDAO;
import model.entity.Course;
import model.entity.Grade;
import model.entity.Student;

import java.util.LinkedList;
import java.util.List;


/**
 * The StudentManager class will act as the system's model, storing and
 * managing the information the user enters.
 *
 * The StudentManager class will use the system's DAOs to manage
 * to abstractly access and modify the information.
 */
public class StudentManager {
    // Attribtues storing any implementation of the DAOs.
    private final StudentDAO studentDao;
    private final CourseDAO courseDao;
    private final GradeDAO gradeDao;

    // Constructor initializing a specific implementation of the DAOs. In this
    //  occasion, the SQL implementations will be used.
    public StudentManager() {
        studentDao = new SQLStudentDAO();
        courseDao = new SQLCourseDAO();
        gradeDao = new SQLGradeDAO();
    }


    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public List<Student> getStudents() {
        return studentDao.getAllStudents();
    }

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public List<Course> getCourses() {
        return courseDao.getAllCourses();
    }

    public List<Grade> getGradesOfStudent(int studentId) {
        return gradeDao.getGradesOfStudent(studentId);
    }

    public void addGrade(int studentId, String courseCode, int grade) {
        gradeDao.addGrade(studentId, courseCode, grade);
    }

    public void deleteCourse(String code) {
        courseDao.deleteCourse(code);
    }

}
