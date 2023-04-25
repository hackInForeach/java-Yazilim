package Business;

import DataAccess.CourseDao;
import Entities.Course;
import Logging.BaseLogger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] baseLoggers;
    private Course[] courses;

    public CourseManager() {

    }

    public CourseManager(CourseDao courseDao, BaseLogger[] baseLoggers, Course[] courses) {
        this.courseDao = courseDao;
        this.baseLoggers = baseLoggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
//        for (Course course1 : courses) {
//            if (course1.getCourseName() == course.getCourseName()) {
//                throw new Exception("Aynı isimde kurs olamaz.");
//            }

        if (course.getUnitPrice() <= 0) {
            throw new Exception("Kurs fiyatı sıfır yada sıfırdan küçük olamaz");
        }

        courseDao.add(course);
        for (BaseLogger baseLogger : baseLoggers) {
            baseLogger.add(course.getCourseName());
        }

    }

}

