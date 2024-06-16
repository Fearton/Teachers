import java.util.List;

import controller.StudentController;
import controller.TeacherConteroller;
import model.Student;
import model.Teacher;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeacherConteroller()
                .sendOnConsole(List.of(new Teacher(2, "Ivan", "Ivanovich"),
                        new Teacher(3, "Petrov", "Petrovich")));
    }
}