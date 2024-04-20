package models;

import java.util.List;

public class Department implements University.Human {
    private String name;
    private List<University.Human> members;
    private Human head;

    public Department(String name, List<University.Human> members) {
        this.name = name;
        this.members = members;
    }

    // Конструктор с двумя аргументами
    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }
    // Геттеры и сеттеры для head
    // ...
}
