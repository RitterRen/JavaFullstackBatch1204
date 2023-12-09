package Question1;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int nameCode = name == "" ? 0 : name.hashCode();

        return nameCode * 31 + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        return this.name.equals(employee.name) && this.salary == employee.salary;
    }
}
