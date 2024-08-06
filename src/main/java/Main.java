import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        6. ООП
//        Задание 3. Студенты
        int[] grades= {4,5,5};

        Student student=new Student("Alex", grades);
        System.out.println(student);
        student.setGrades(5);
        System.out.println(student);

        Student stud2=new Student("Max");
        System.out.println(stud2);
        stud2.setGrades(4);
        System.out.println(stud2);
    }
}