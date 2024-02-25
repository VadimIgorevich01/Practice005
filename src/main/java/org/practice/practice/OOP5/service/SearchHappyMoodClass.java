package org.practice.practice.OOP5.service;

import org.practice.practice.OOP5.model.AverageMood;
import org.practice.practice.OOP5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SearchHappyMoodClass implements SearchMood{
    @Override
    public void SearchCertainMood(List<Student> studentGroup) {
        List <Student> studentsHappyMood = new ArrayList<>();
        for (int i = 0; i < studentGroup.size(); i++) {
            if (studentGroup.get(i).IntLvl == AverageMood.HAPPY) {
                studentsHappyMood.add(studentGroup.get(i));
            }
        }
        System.out.println(" следующие психологически устойчивые студенты = " + studentsHappyMood);
    }
}
