import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        6. ООП
//        Задание 4. Сотрудник

        Employee bossIt = new Employee("Anton");
        Department depIt = new Department("IT", bossIt);
        bossIt.setDep(depIt);
        Department depMarket = new Department("Market");

        Employee empIt = new Employee("Petr", depIt);
        Employee emp2It = new Employee("Anna", depIt);
        Employee empMarket = new Employee("Vanya", depMarket);
        Employee emp2Market = new Employee("Liza", depMarket);
        depMarket.setBoss(emp2Market);

        System.out.println(empIt);
        System.out.println(emp2It);
        System.out.println(empMarket);
        System.out.println(emp2Market);

        System.out.println(" ");

        depIt.setBoss(empMarket);
        System.out.println(empIt);
        System.out.println(emp2It);
        System.out.println(empMarket);
        System.out.println(emp2Market);

//        Задание 3. Студенты
/*
        int[] grades= {4,5,5};

        Student student=new Student("Alex", grades);
        System.out.println(student);
        student.setGrades(5);
        System.out.println(student);

        Student stud2=new Student("Max");
        System.out.println(stud2);
        stud2.setGrades(4);
        System.out.println(stud2);
 */
    }
}