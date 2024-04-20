// Файл: Group.java
package models;
public class Group {
    // Поля класса
    private String groupName;
    private int groupSize;

    // Конструктор класса
    public Group(String groupName, int groupSize) {
        this.groupName = groupName;
        this.groupSize = groupSize;
    }

    // Методы класса
    public void displayGroupInfo() {
        System.out.println("Group Name: " + groupName);
        System.out.println("Group Size: " + groupSize);
    }

    // Геттеры и сеттеры
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    public String groupName() {
        return groupName;
    }

    public int groupSize() {
        return groupSize;
    }
}
