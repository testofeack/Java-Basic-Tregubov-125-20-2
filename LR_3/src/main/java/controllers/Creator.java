package controllers;

import models.*;

// Abstract class Creator
abstract class Creator {
    protected Human createHuman(String firstName, String lastName, String patronymic, Sex sex) {
        return new Human(firstName, lastName, patronymic, sex);
    }
}


//class StudentCreator extends Creator {
//    public Student createStudent(String name, int age, String group, Sex sex) {
//        return new Student(name, age, group, sex);
//    }
//}

// Class DepartmentCreator, extends Creator
//class DepartmentCreator extends Creator {
//    public Department createDepartment(String name, Human head) {
//        return new Department(name, head);
//    }
//}

// Class FacultyCreator, extends Creator
//class FacultyCreator extends Creator {
//    public Faculty createFaculty(String name, Human head) {
//        return new Faculty(name, head);
//    }
//}

// Class GroupCreator, extends Creator
//class GroupCreator extends Creator {
//    public Group createGroup(String groupName,  int groupSize) {
//        return new Group(groupName,  groupSize);
//    }
//}

// Class UniversityCreator, extends Creator
//public class UniversityCreator extends Creator {
//    public University createUniversity(String name, Human head) {
//        return new University(name, head);
//    }
//}
