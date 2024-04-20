package models;

import java.util.List;

public class Faculty implements University.Human {
    private String name;
    private List<University.Human> members;
    private List<Department> departments;
    private Human head;

    // Конструктор с двумя аргументами для членов университета
    public Faculty(String name, List<University.Human> members) {
        this.name = name;
        this.members = members;
    }

    // Конструктор без аргументов (если нужно)
    public Faculty() {
        // здесь можно проинициализировать поля по умолчанию или оставить пустым
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<University.Human> getMembers() {
        return members;
    }

    public void setMembers(List<University.Human> members) {
        this.members = members;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}
