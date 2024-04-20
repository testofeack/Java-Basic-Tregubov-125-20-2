package models;

public class Student {
    private String firstName;
    private int age;
    private String lastName;
    private String middleName;
    private Sex sex;
    private String group;

    public Student(String firstName, int age, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    // Геттеры и сеттеры
    // ...


    // Метод для виведення інформації
    public void showInformation() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Group: " + group);
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Додайте аналогічні методи для lastName, middleName, age, sex та group
}
