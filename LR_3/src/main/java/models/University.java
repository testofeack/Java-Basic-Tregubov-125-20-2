package models;

public class University {
    public String name;
    public Human head;

    // Конструктор с двумя аргументами
    public University(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}
