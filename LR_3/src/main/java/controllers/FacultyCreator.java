package controllers;
import controllers.Creator;
import models.Faculty;
import models.Human;

public class FacultyCreator extends Creator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}