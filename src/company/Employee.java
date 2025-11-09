package company;

public class Employee {
    // Static variables
    private static int numOfEmployees;

    // Instance variables
    private String firstname;
    private String lastname;
    private int age;
    private int salary;
    private boolean isWorking;
    private int id;

    // Constructors
    public Employee(String firstname, String lastname, int age, int salary, boolean isWorking, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.isWorking = isWorking;  // Fixed: was hardcoded to false
        this.id = id;
    }

    public Employee() {
        this.firstname = "First Name: blank";
        this.lastname = "Last Name: blank";
        this.age = 0;
        this.salary = 0;
        this.isWorking = false;
        this.id = 0;
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public int getId() {
        return id;
    }

    public static int getNumOfEmployees() {
        return numOfEmployees;
    }

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setNumOfEmployees(int numOfEmployees) {
        Employee.numOfEmployees = numOfEmployees;
    }

    // Other methods
    public void viewEmployeeData() {
        System.out.println();
        System.out.println(getFirstname());
        System.out.println(getLastname());

        if (age == 0) {
            System.out.println("Age: N/A");
        } else {
            System.out.println("Age: " + getAge());
        }

        if (salary == 0) {
            System.out.println("Salary: N/A");
        } else {
            System.out.println("Salary: " + getSalary());
        }

        if (isWorking) {  // Simplified from isWorking == true
            System.out.println("Shift status: He is currently on shift.");
        } else {
            System.out.println("Shift status: N/A");
        }

        if (id == 0) {
            System.out.println("ID: N/A");
            System.out.println("\nThis employee does not exist");
        } else {
            System.out.println("ID: " + getId());
        }
    }
}
