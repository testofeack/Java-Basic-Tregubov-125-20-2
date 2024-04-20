package models;

import controllers.UniversityCreator;
import controllers.FacultyCreator;
import controllers.DepartmentCreator;
import controllers.StudentCreator;
import controllers.GroupCreator;

// Class Run
public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        // Создание университета
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Sample University", null);
        System.out.println("Университет: " + university.getName());

        // Создание факультетов
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty1 = facultyCreator.createFaculty("Faculty of Science", null);
        Faculty faculty2 = facultyCreator.createFaculty("Faculty of Arts", null);
        System.out.println("Факультеты:");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());

        // Создание кафедр
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department1 = departmentCreator.createDepartment("Computer Science", null);
        Department department2 = departmentCreator.createDepartment("Mathematics", null);
        Department department3 = departmentCreator.createDepartment("History", null);
        System.out.println("Кафедры:");
        System.out.println("- " + department1.getName());
        System.out.println("- " + department2.getName());
        System.out.println("- " + department3.getName());

        // Создание групп
        GroupCreator groupCreator = new GroupCreator();
        Group group1 = groupCreator.createGroup("CS101", 11);
        Group group2 = groupCreator.createGroup("Math101", 95);
        Group group3 = groupCreator.createGroup("History101", 40);
        System.out.println("Группы:");
        System.out.println("- " + group1.groupName() + ", количество студентов: " + group1.groupSize());
        System.out.println("- " + group2.groupName() + ", количество студентов: " + group2.groupSize());
        System.out.println("- " + group3.groupName() + ", количество студентов: " + group3.groupSize());

        // Создание студентов
        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("John", 20, "CS101", Sex.MALE);
        Student student2 = studentCreator.createStudent("Jane", 22, "Math101", Sex.FEMALE);
        System.out.println("Студенты:");
        System.out.println("- " + student1.getName() + ", возраст: " + student1.getAge() + ", группа: " + student1.getGroup());
        System.out.println("- " + student2.getName() + ", возраст: " + student2.getAge() + ", группа: " + student2.getGroup());
    }
}
