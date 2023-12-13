package Question5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Yaokun", "Ren", 45),
                new Employee("Beacon", "Fire", 42),
                new Employee("Brianna", "Smith", 41),
                new Employee("Catherine", "Doe", 39)
        );

        List<Employee> newEmployees = employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("B") && employee.getAge() > 40)
                .toList();
    }
}
