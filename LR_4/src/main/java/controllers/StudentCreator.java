package controllers;
import controllers.Creator;
import models.Sex;
import models.Student;
import models.University;

public class UniversityCreator extends Creator {
    public University createUniversity(String name, String headName) {
        return new University(name, headName);
    }
}
