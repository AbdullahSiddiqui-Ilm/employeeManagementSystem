package company;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company c = new Company();

        boolean running = true;
        while (running) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display all Employees");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    c.addEmployee(scanner);
                    break;
                case 2:
                    c.removeEmployee();
                    break;
                case 3:
                    c.displayAllEmployees();
                    break;
                case 4:
                    running = false;
                    break;
            }
        }



        scanner.close();
        System.out.println("Program has ended");
    }
}