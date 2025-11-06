package company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployee(Employee e){
        employeeList.add(e);
    };

    public void displayAllEmployees(){
        System.out.printf("%-5s %-15s %-15s %-5s %-10s %-10s\n",
                "ID", "First Name", "Last Name", "Age", "Salary", "Shift");
        System.out.println("-------------------------------------------------------------------");
        for (Employee e: employeeList){
            System.out.printf("%-5s %-15s %-15s %-5s %-10s %-10s\n",
                    e.getId(), e.getFirstname(), e.getLastname(), e.getAge(), e.getSalary(), e.isWorking() ? "On shift":"Off shift");
        }
    };
}
