package controllers;

import controllers.Creator;
import models.Sex;
import models.Student;

// Class StudentCreator, extends Creator
public class StudentCreator extends Creator {
    public Student createStudent(String name, int age, String group, Sex sex) {
        return new Student(name, age, group, sex);
    }
}
