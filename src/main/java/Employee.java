public class Employee {
    String name;
    Department dep;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (this == dep.boss) return name + " начальник отдела " + dep.name;
        return name + " работает в отделе " + dep;
    }
}
