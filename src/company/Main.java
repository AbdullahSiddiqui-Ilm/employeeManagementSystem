package company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Abdullah", "Siddiqui",22, 19250, false, 2456 );
        Employee employee2 = new Employee("AbdurRahman", "Ashfaq", 25, 17000, false, 5894 );
        Employee employee3 = new Employee("AbdurRaazzaq", "Al-Badr", 23, 17500, false, 9754 );
        Employee employee4 = new Employee("Arshad","Siddiqui", 69, 13057,false , 4790 );

        Company c = new Company();
        c.addEmployee(employee1);
        c.addEmployee(employee2);
        c.addEmployee(employee3);
        c.addEmployee(employee4);

        c.displayAllEmployees();




        double avg = EmployeeUtils.calculateAverageSalary(c.getEmployeeList());
        System.out.println("\n" + avg);

    }
}