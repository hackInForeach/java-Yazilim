package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class HibernateProductDao implements CategoryDao,CourseDao,InstructorDao{
    public void add(Category category) {
        System.out.println("Hibernate ile veri tabanına eklendi : " + category.getName());
    }

    public void add(Course course) {
        System.out.println("Hibernate ile veri tabanına eklendi : " + course.getCourseName()+" "+course.getUnitPrice());
    }

    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veri tabanına eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
