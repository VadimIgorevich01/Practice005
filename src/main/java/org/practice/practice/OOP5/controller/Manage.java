package org.practice.practice.OOP5.controller;

import org.practice.practice.OOP5.model.FullGroup;
import org.practice.practice.OOP5.service.SearchMood;
import org.practice.practice.OOP5.service.SearchHappyMoodClass;
import org.practice.practice.OOP5.service.ServiceTrainingGroup;
import org.practice.practice.OOP5.service.Students;
import org.practice.practice.OOP5.view.ShowInfo;

public class Manage {
    public void showTrainingGroups() {
        ServiceTrainingGroup serviceTrainingGroup = new ServiceTrainingGroup();
        FullGroup group1 = serviceTrainingGroup.getGroup(1, 1);
        FullGroup group2 = serviceTrainingGroup.getGroup(2, 2);
        FullGroup group3 = serviceTrainingGroup.getGroup(1, 3);
        ShowInfo showInfo = new ShowInfo();
        showInfo.showGroup(group1);
        showInfo.showGroup(group2);
        showInfo.showGroup(group3);
    }

    public void showHappyMoodInGroup(int studentGroupId) {
        Students students = new Students();
        SearchMood searchMood = new SearchHappyMoodClass();
        System.out.printf("В группе " + studentGroupId);
        searchMood.SearchCertainMood(students.getStudentsList(studentGroupId));

    }
}
