package controllers;

import controllers.Creator;
import models.Human;
import models.University;

public class UniversityCreator extends Creator {
    public University createUniversity(String name, Human head) {
        return new University(name, head);
    }
}