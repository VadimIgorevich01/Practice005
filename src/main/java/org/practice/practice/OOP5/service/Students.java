package org.practice.practice.OOP5.service;

import org.practice.practice.OOP5.model.AverageMood;
import org.practice.practice.OOP5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Students {
    Student student1 = new Student("Vadim", AverageMood.HAPPY);
    Student student2 = new Student("Vitaliy", AverageMood.SAD);
    Student student3 = new Student("Nikita", AverageMood.HAPPY);
    Student student4 = new Student("Pavel", AverageMood.QUIET);
    Student student5 = new Student("Anna", AverageMood.ANGRY);
    public List<Student> studentsList1 = new ArrayList<>();
    public List<Student> studentsList2 = new ArrayList<>();
    public List<Student> studentsList3 = new ArrayList<>();
    public List<Student> getStudentsList(int groupNumber) {
        if (groupNumber == 1) {
            studentsList1.add(student1);
            studentsList1.add(student2);
            return studentsList1;
        } else if (groupNumber == 2) {
            studentsList2.add(student3);
            studentsList2.add(student4);
            studentsList2.add(student5);
            return studentsList2;
        } else {
            studentsList3.add(student1);
            studentsList3.add(student5);
            return studentsList3;
        }
    }

}
