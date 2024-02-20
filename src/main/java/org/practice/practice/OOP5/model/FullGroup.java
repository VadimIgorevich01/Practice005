package org.practice.practice.OOP5.model;

import org.practice.practice.OOP5.model.Student;
import org.practice.practice.OOP5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class FullGroup {
    private static int counterGroupStatic = 0;
    private int groupNumber;

    @Override
    public String toString() {
        return "Группа " + groupNumber +
                ": " + teacher +
                ", Cтуденты в группе=" + studentList;
    }

    public FullGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        counterGroupStatic++;
        this.groupNumber = counterGroupStatic;
    }

    Teacher teacher;
    List<Student> studentList = new ArrayList<>();

}
