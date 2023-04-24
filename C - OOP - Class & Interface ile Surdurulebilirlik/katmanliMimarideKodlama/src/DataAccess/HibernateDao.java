package DataAccess;

import Entities.Category;
import Entities.Course;
import Entities.Instructor;

public class HibernateDao implements CategoryDao,CourseDao,InstructorDao{
    public void add(Category category){
        System.out.println("Hiybernate ile eklendi : "+category.getName());
    }
    public void add(Course course){
        System.out.println("Hiybernate ile eklendi : "+course.getName());
    }
    public void add(Instructor instructor){
        System.out.println("Hiybernate ile eklendi : "+instructor.getName());
    }
}
