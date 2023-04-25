import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import DataAccess.HibernateProductDao;
import DataAccess.JdbcProductDao;
import DataAccess.JpaProductDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logging.BaseLogger;
import Logging.DatabaseLogger;
import Logging.FileLogger;
import Logging.MailLogger;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Exception {

        //Karşılaştırmayı bir türlü yapamadım

        BaseLogger[] baseLoggers = new BaseLogger[]{new MailLogger(), new FileLogger(), new DatabaseLogger()};

        Course course = new Course(1, "Java kodlama", 3000);
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

        Course course1 = new Course(2, "Java kodlama2", 3000);
        Instructor instructor1 = new Instructor(2, "Doğukan", "Öztürk");


        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");

        Course[]courses={course,course1};

        CourseManager courseManager = new CourseManager(new JpaProductDao(), baseLoggers, courses);
        courseManager.add(course);


        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");

        courseManager.add(course1);

        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");


        Instructor[] instructors={instructor1,instructor};

        InstructorManager instructorManager = new InstructorManager(new HibernateProductDao(), baseLoggers, instructors);
        instructorManager.add(instructor);


        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");

        instructorManager.add(instructor1);

        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");


        CategoryManager categoryManager = new CategoryManager(courses);
        categoryManager.add(course);

        System.out.println("\n");
        System.out.println("*****************************************************");
        System.out.println("\n");


    }
}