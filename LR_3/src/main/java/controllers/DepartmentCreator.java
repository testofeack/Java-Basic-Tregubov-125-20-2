package controllers;

import models.Department;
import models.Human;

public class DepartmentCreator extends Creator {
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
