package Question1;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamTestDrive {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ritter Ren", 60000));
        employees.add(new Employee("Xiao Huang", 180000));
        employees.add(new Employee("Kevin D", 120000));
        employees.add(new Employee("Kathy G", 30000));

        // 1. Calculate the average salary of the list of employees
        OptionalDouble aveSalary = employees.stream()
                                            .mapToInt(employee -> employee.salary)
                                            .average();

        System.out.println("Average salary for the employees: " + aveSalary.getAsDouble());

        // 2. Filter for employees whose salary exceeds 80000 and print out their names
        employees.stream()
                 .filter(employee -> employee.salary > 80000)
                 .forEach(employee -> System.out.println("Salary exceeds 80000: " + employee.name));

        // 3. Collect a Map of employees where the key is the name of employee value is employee obj.
        Map<String, Employee> map = employees.stream()
                 .collect(Collectors.toMap(employee -> employee.name, employee -> employee));

        System.out.println(map);

        // 4. Find any Employee whose name starts with the character X
        boolean hasX = employees.stream()
                                .filter(employee -> employee.name.startsWith("X"))
                                .peek(employee -> System.out.println("Begin with X : " + employee.name))
                                .findAny()
                                .isPresent();
        if (!hasX) {
            System.out.println("No such employee exists");
        }

        // 5. Create a String that contains the name of every single employee in the list concatenated together.
        String employeesName = employees.stream()
                                        .map(employee -> employee.name)
                                        .collect(Collectors.joining());
        System.out.println("All the employees name concat: " + employeesName);
    }
}
