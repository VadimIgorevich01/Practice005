package org.practice.practice.OOP5.model;

public class Student extends TrainingGroup{
    @Override
    public String toString() {
        return "(Студент:" +
                " имя=" + super.name +
                " Настроение=" + IntLvl +
                ", ID=" + studentID + ")";
    }

    public AverageMood IntLvl;
    private static int counterStudentStatic = 0;
    private int studentID;

    public int getStudentID() {
        return studentID;
    }

    public Student(String inputName, AverageMood IntLevel) {
        super(inputName);
        this.IntLvl = IntLevel;
        counterStudentStatic++;
        this.studentID = counterStudentStatic;
    }

}
