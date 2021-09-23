package dao;

import entities.Student;
import java.util.ArrayList;

public class StudentDao {

    private static ArrayList<Student> students;

    static {
        students = new ArrayList<Student>();
        students.add(new Student("Андреева Ирина", 3.48f, false));
        students.add(new Student("Анферова Анастасия", 3.45f, false));
        students.add(new Student("Беднов Андрей", 4.98f, true));
        students.add(new Student("Белозуб Яна", 4.5f, true));
        students.add(new Student("Белоус Алексей", 3.84f, true));
        students.add(new Student("Котума Андрей", 4.25f, true));
        students.add(new Student("Колодин Денис", 3.08f, false));
        students.add(new Student("Кузьмин Дмитрий", 4.69f, true));
        students.add(new Student("Ланин Иван", 4.62f, false));
        students.add(new Student("Локтев Илья", 3.38f, true));
        students.add(new Student("Павлова Александра", 4.84f, true));
        students.add(new Student("Петров Алексей", 4.18f, false));
        students.add(new Student("Путятинский Дмитрий", 4.61f, false));
        students.add(new Student("Роках Глеб", 4.04f, true));
        students.add(new Student("Салаутин Дмитрий", 3.42f, true));
        students.add(new Student("Семенов Егор", 4.82f, false));
        students.add(new Student("Шкодин Максим", 4.59f, true));
        students.add(new Student("Шмыгин Семен", 3.27f, false));
        students.add(new Student("Амангалиев Артём", 4.18f, true));
        students.add(new Student("Гаджимурадов Руслан", 4.12f, true));
        students.add(new Student("Горячкин Александр", 3.11f, false));
        students.add(new Student("Долгов Денис", 3.29f, true));
        students.add(new Student("Карпенко Дмитрий", 4.84f, false));
        students.add(new Student("Мартышин Иван", 3.25f, true));
        students.add(new Student("Подкосов Антон", 3.5f, true));
        students.add(new Student("Соседова Виктория", 3.09f, false));
        students.add(new Student("Тарасов Олег", 4.01f, true));
        students.add(new Student("Черникова Алина", 3.85f, false));
        students.add(new Student("Кулаков Максим", 4.84f, true));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }
}
