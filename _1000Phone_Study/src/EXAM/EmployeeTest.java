package EXAM;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Jerforce
 * @date 2023/3/31 星期五 20:10:42
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三", 1000));
        employees.add(new Employee("李四", 2000));
        employees.add(new Employee("王五", 3000));
        employees.add(new Employee("赵六", 4000));
        employees.add(new Employee("钱七", 500));
        double AverageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(AverageSalary);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        List<Employee> matchingEmployees = employees.stream().filter(e->e.getName().equals(name)).collect(Collectors.toList());
        System.out.println(matchingEmployees);

        sc.close();

        List<String> TopthreeNames = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).map(Employee::getName).collect(Collectors.toList());
        System.out.println(TopthreeNames);


    }
}
