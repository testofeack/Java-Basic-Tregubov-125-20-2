package models;

public class Department {
    private String name;
    private Human head;

    // Конструктор без аргументов (если нужно)
    public Department() {
        // здесь можно проинициализировать поля по умолчанию или оставить пустым
    }

    // Конструктор с двумя аргументами
    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }
    // Геттеры и сеттеры
    // ...
}
