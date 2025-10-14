public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Abdullah", "Siddiqui",22, 15000, false, 2456 );
        Employee employee2 = new Employee("AbdurRahman", "Ashfaq", 25, 17000, false, 5894 );
        Employee employee3 = new Employee("AbdurRaazzaq", "Al-Badr", 23, 17000, false, 9754 );


        System.out.println(employee1.changeWorking());
        employee2.viewEmployeeData();


    }
}