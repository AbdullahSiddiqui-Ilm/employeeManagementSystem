package company;

import java.util.List;
public class EmployeeUtils {

    public static double calculateAverageSalary(List<Employee> employees){
        double total = 0;
        for (Employee employee: employees){total += employee.getSalary();}
        return total / employees.size();
    }
}
