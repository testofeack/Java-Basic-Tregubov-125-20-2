package models;

import controllers.UniversityCreator; // Импорт класса UniversityCreator

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

        // Создание университета
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Sample University", this.getFullName());
    }

    // Геттеры и сеттеры
    // ...

    // Метод для получения полного имени
    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }
}
