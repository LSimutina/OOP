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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (this == dep.getBoss()) return name + " начальник отдела " + dep.getName();
        return name + " работает в отделе " + dep;
    }
}
