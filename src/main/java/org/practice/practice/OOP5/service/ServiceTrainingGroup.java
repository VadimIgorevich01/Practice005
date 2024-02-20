package org.practice.practice.OOP5.service;
import org.practice.practice.OOP5.model.*;

public class ServiceTrainingGroup {

    Students students = new Students();
    Teachers teachers = new Teachers();
    public FullGroup getGroup(int teacherID, int groupID) {
        FullGroup fullGroup = new FullGroup(teachers.getTeacher(teacherID), students.getStudentsList(groupID));
        return fullGroup;
    }
}
