public class Department {
    String name;
    Employee boss;

    public Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return name + ", начальник которого " + boss.name;
    }
}
