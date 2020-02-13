package model.classmembers;

public abstract class GroupMember {

    private String name;

    GroupMember(String name){
        this.name = name;
    }

    abstract public String getInfo();

    String getName(){
        return this.name;
    }

}
