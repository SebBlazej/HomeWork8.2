package model.studyclass;

import model.classmembers.GroupMember;
import model.classmembers.Student;
import model.classmembers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    private String groupName;
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public StudyGroup(String groupName, Teacher teacher){
        this.groupName = groupName;
        this.teacher = teacher;
    }

    public void printAllInfo(){
        System.out.println("Nazwa grupy - " + this.groupName);
        for(GroupMember member: this.getAllMembers()){
            System.out.println(member.getInfo());
        }
        System.out.println();
    }

    public void removeStudent(Student student){
        this.studentList.remove(student);
    }


    public void addStudent(Student student){
        this.studentList.add(student);
    }

    private List<GroupMember> getAllMembers(){
        List<GroupMember> tempList = new ArrayList<>();
        tempList.add(teacher);
        tempList.addAll(studentList);
        return tempList;
    }


}
