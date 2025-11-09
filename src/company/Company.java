package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployee(Scanner scanner) {

        // Create new employee
        Employee emp = new Employee();

        // Get user input and use setters
        System.out.print("Enter first name: ");
        emp.setFirstname(scanner.nextLine());

        System.out.print("Enter last name: ");
        emp.setLastname(scanner.nextLine());

        System.out.print("Enter age: ");
        emp.setAge(scanner.nextInt());

        System.out.print("Enter salary: ");
        emp.setSalary(scanner.nextInt());

        System.out.print("Is working? (true/false): ");
        emp.setWorking(scanner.nextBoolean());

        System.out.print("Enter ID: ");
        emp.setId(scanner.nextInt());

        // Add to your list/array
        employeeList.add(emp);

        System.out.println("Employee added successfully!");
    }


    public void removeEmployee(){}

    public void displayAllEmployees(){
        System.out.printf("%-5s %-15s %-15s %-5s %-10s %-10s\n",
                "ID", "First Name", "Last Name", "Age", "Salary", "Shift");
        System.out.println("-------------------------------------------------------------------");
        for (Employee e: employeeList){
            System.out.printf("%-5s %-15s %-15s %-5s %-10s %-10s\n",
                    e.getId(), e.getFirstname(), e.getLastname(), e.getAge(), e.getSalary(), e.isWorking() ? "On shift":"Off shift");
        }
        System.out.println("-------------------------------------------------------------------");
    };
}
