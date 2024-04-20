package University;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.*;

public class UniversityTest {

    @Test
    public void testWriteAndReadJson() {
        // Создаем объект университета
        University oldUniversity = createUniversity();

        // Записываем университет в файл
        String fileName = "university.json";
        JsonManager.writeToJsonFile(oldUniversity, fileName);

        // Считываем университет из файла
        University newUniversity = JsonManager.readFromJsonFile(fileName, University.class);

        // Проверяем, равны ли они
        assertEquals(oldUniversity, newUniversity);
    }

    // Метод для создания объекта университета для тестирования
    private University createUniversity() {
        Student student1 = new Student("Ім'я1", 20, "Прізвище1", "По-батькові1", Sex.MALE);
        Student student2 = new Student("Ім'я2", 21, "Прізвище2", "По-батькові2", Sex.FEMALE);

        List<Student> students1 = Arrays.asList(student1, student2);
        List<Student> students2 = Arrays.asList(student1, student2);

        Group group1 = new Group("Група1", students1);
        Group group2 = new Group("Група2", students2);

        // Создаем списки объектов типа University.Human для групп
        List<University.Human> universityMembers1 = Arrays.asList(group1, group2);
        List<University.Human> universityMembers2 = Arrays.asList(group1, group2);

        // Создаем факультеты с использованием этих списков
        Faculty faculty1 = new Faculty("Факультет1", universityMembers1);
        Faculty faculty2 = new Faculty("Факультет2", universityMembers2);

        // Создаем список факультетов для передачи в конструктор университета
        List<Faculty> facultyList = Arrays.asList(faculty1, faculty2);

        // Возвращаем новый объект университета
        return new University("Назва університету", facultyList);
    }
}
