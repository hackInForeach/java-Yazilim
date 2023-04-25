package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class JpaProductDao implements CategoryDao, CourseDao, InstructorDao{
    public void add(Category category) {
        System.out.println("JPA ile veri tabanına eklendi : " + category.getName());
    }

    public void add(Course course) {
        System.out.println("JPA ile veri tabanına eklendi : " + course.getCourseName());
    }

    public void add(Instructor instructor) {
        System.out.println("JPA ile veri tabanına eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
