package org.practice.practice.OOP5.model;

public class Teacher extends TrainingGroup{
    @Override
    public String toString() {
        return "Имя учителя=" + super.name +
                ", ID=" + teacherID;
    }

    private static int counterTeacherStatic = 0;

    public int getTeacherID() {
        return teacherID;
    }

    private int teacherID;
    public Teacher(String inputName) {
        super(inputName);
        counterTeacherStatic++;
        this.teacherID = counterTeacherStatic;
    }
}
