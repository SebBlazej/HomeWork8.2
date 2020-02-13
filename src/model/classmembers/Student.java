package model.classmembers;

public class Student extends GroupMember {

    private int amountOfPoints;

    public Student(String name, int amountOfPoints){
        super(name);
        this.amountOfPoints = amountOfPoints;
    }

    @Override
    public String getInfo(){
        return "Student - " + super.getName() + " - ilosc punktów - " + this.amountOfPoints;
    }

    public void addPoints(int pointsToAdd){
        this.amountOfPoints += pointsToAdd;
    }


}
