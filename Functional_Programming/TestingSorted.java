import java.util.List;

public class TestingSorted
{
    public static void main(String[] args) {
        List<Employee> employee = List.of(
            new Employee("Aryan", 100000),
            new Employee("Ram", 1),
            new Employee("Rahul", 500),
            new Employee("Vedant", 67),
            new Employee("Prashant", 4500)
        );

        employee.stream()
                  .sorted((emp1, emp2) -> Integer.compare(emp1.getSalaray(), emp2.getSalaray()))
                  .forEach(System.out::println);
    }
}