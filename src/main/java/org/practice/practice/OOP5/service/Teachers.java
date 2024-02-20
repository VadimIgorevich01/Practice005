package org.practice.practice.OOP5.service;

import org.practice.practice.OOP5.model.Teacher;

import java.util.List;

public class Teachers {
    public Teacher teacher1 = new Teacher("Irina");
    public Teacher teacher2 = new Teacher("Elena");
    public Teacher getTeacher (int teacherID) {
        if (teacherID == 1) {
            return teacher1;
        } else {
            return teacher2;
        }
    }
}
