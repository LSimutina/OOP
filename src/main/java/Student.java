import java.util.Arrays;

public class Student {
    String name;
    int[] grades = {0};

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int[] grades) {
        this.name = name;
        isPositiveArr(grades);
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }

    private void isPositiveArr(int[] grades) {
        for (int grade : grades) {
            isPositiveGrades(grade);
        }
    }

    private void isPositiveGrades(int grades) {
        if ((grades < 2) || (grades > 5)) {
            throw new IllegalArgumentException("Оценки должны быть от 2 до 5");
        }
    }

    public void setGrades(int newGrades) {
        isPositiveGrades(newGrades);
        if (grades[0] == 0) {
            grades[0] = newGrades;
        } else {
            this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
            grades[grades.length - 1] = newGrades;
        }
    }
}
