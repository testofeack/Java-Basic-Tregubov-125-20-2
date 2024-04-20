package controllers;

import models.Human;
import models.University;

public class UniversityCreator extends Creator {
    public University createUniversity(String name, String headName) {
        return new University(name, headName);
    }
}
