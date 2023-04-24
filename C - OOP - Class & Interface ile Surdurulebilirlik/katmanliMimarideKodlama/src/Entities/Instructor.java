package Entities;

public class Instructor {
    private String name;
    public Instructor(){

    }
    public Instructor(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }public void setName(String name){
        this.name=name;
    }
}
