package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class OrmProductDao implements CategoryDao, CourseDao, InstructorDao{
    public void add(Category category) {
        System.out.println("ORM ile veri tabanına eklendi : " + category.getName());
    }

    public void add(Course course) {
        System.out.println("ORM ile veri tabanına eklendi : " + course.getCourseName()+" "+course.getUnitPrice());
    }

    public void add(Instructor instructor) {
        System.out.println("ORM ile veri tabanına eklendi : " + instructor.getLastName());
    }
}
