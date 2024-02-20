package org.practice.practice.OOP5.controller;

import org.practice.practice.OOP5.model.FullGroup;
import org.practice.practice.OOP5.service.ServiceTrainingGroup;
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
}
