package Business;

import DataAccess.CourseDao;
import Entities.Course;
import Logging.Logger;

import java.util.List;
import java.util.Objects;

public class CourseManager {
    private final CourseDao courseDao;
    private final List<Logger> loggers;
    private final List<Course> courses;

    public CourseManager(CourseDao courseDao,List<Logger> loggers, List<Course> courses){
        this.courseDao=courseDao;
        this.loggers=loggers;
        this.courses=courses;
    }

    public void add(Course course) throws Exception{
        if (course.getUnitPrice()<=0){
            throw new Exception("Kurs fiyatı 0 yada negatif olamaz!");
        }
        for (Course course1:courses){
            if (Objects.equals(course1.getName(), course.getName()))
                throw new Exception("Böyle bir kurs tanımlı.");
        }
        courseDao.add(course);
        for (Logger logger:loggers){
            logger.log(course.getName());
        }

    }

}
