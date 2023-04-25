package Business;

import Entities.Course;

import java.util.ArrayList;

public class CategoryManager {
    private Course[] courses;

    public CategoryManager() {

    }

    public CategoryManager(Course[] courses) {
        this.courses=courses;
    }

    public void add(Course course) {
        int i=1;
        System.out.println("Category: ");
        for (Course course1 :courses) {
            System.out.println(i+". "+course1.getCourseName());
            i++;
        }

    }

}

