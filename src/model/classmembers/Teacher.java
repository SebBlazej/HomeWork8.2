package model.classmembers;

public class Teacher extends GroupMember {

    private int salary;

    public Teacher(String name, int salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public String getInfo(){
        return "Prowadzący - " + super.getName() + " - zarobek za zajęcia - " + this.salary;
    }

}
