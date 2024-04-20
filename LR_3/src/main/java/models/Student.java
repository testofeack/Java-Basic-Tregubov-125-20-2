package models;

public class Student {
    private String name;
    private int age;
    private String group;
    private Sex sex;

    // Конструктор с четырьмя аргументами
    public Student(String name, int age, String group, Sex sex) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.sex = sex;
    }

    // Геттеры и сеттеры
    // ...


    // Class methods
    public void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Group: " + group);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
