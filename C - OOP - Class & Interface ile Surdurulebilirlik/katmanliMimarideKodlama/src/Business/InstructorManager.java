package Business;

import DataAccess.InstructorDao;
import Entities.Course;
import Entities.Instructor;
import Logging.BaseLogger;

import java.util.ArrayList;
import java.util.Arrays;

public class InstructorManager extends Course {
    private InstructorDao instructorDao;
    private BaseLogger[] baseLoggers;
    private Instructor[] instructors;
    public InstructorManager(){

    }public InstructorManager(InstructorDao instructorDao,BaseLogger[] baseLoggers,Instructor[] instructors){
        this.instructorDao=instructorDao;
        this.baseLoggers=baseLoggers;
        this.instructors=instructors;
    }
    public void add(Instructor instructor) throws Exception{

//        for (Instructor instructor1:instructors){
//            if (instructor1.getId()== instructor.getId()){
//                throw new Exception("Aynı ID ile giriş yapılamaz!");
//            }
//        }
            instructorDao.add(instructor);

            for (BaseLogger baseLogger:baseLoggers){
                baseLogger.add(instructor.getFirstName());
            }
        }

}
