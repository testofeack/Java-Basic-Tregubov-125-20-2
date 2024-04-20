package models;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    // Конструктор с четырьмя аргументами
    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    // Геттеры и сеттеры
    // ...
}
