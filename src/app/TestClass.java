package app;

import model.classmembers.GroupMember;
import model.classmembers.Student;
import model.classmembers.Teacher;
import model.studyclass.StudyGroup;

public class TestClass {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Marek Kopytko", 1000);
        Student firstStudent = new Student("Marian Rakieta", 3);
        Student secondStudent = new Student("Kasia Kowalska", 4);

        StudyGroup mathStudyGroup = new StudyGroup("Zajecia Matematyki", teacher);
        mathStudyGroup.addStudent(firstStudent);
        mathStudyGroup.addStudent(secondStudent);
        mathStudyGroup.printAllInfo();

        firstStudent.addPoints(10);
        mathStudyGroup.printAllInfo();

        Student thirdStudent = new Student("Patrycja Zięba", 15);
        mathStudyGroup.addStudent(thirdStudent);
        mathStudyGroup.printAllInfo();

        mathStudyGroup.removeStudent(firstStudent);
        mathStudyGroup.printAllInfo();

        Student fourthStudent = new Student("Paweł Kreska");
        mathStudyGroup.addStudent(fourthStudent);
        mathStudyGroup.printAllInfo();

    }
}
