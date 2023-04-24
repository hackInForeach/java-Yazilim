package Business;
import DataAccess.InstructorDao;
import Entities.Instructor;
import Logging.Logger;

import java.util.List;

public class InstructorManager {
    private final InstructorDao instructorDao;
    private final List<Logger> loggers;
    private final List<Instructor> instructors;
    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers,List<Instructor> instructors){
        this.instructorDao=instructorDao;
        this.instructors=instructors;
        this.loggers=loggers;
    }
    public void add(Instructor instructor)throws Exception{
        for (Instructor instructor1:instructors) {
            if (instructor1.getName().equals(instructor.getName())){
                throw new Exception("Bu eğitmen mevcut!");
            }
        }
        instructorDao.add(instructor);
        for (Logger logger:loggers){
            logger.log(instructor.getName());
        }
    }
}
