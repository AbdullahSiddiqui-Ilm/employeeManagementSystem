package company;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private int salary;
    private boolean isWorking;
    private static int numOfEmployees;
    private int id;


    public String getFirstname() {return firstname;}
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


    public Employee(String firstname, String lastname, int age, int salary, boolean isWorking, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.isWorking = false;
        this.id = id;
    }

    public Employee() {
        this.firstname = "First Name: blank";
        this.lastname = "Last Name: blank ";
        this.age = 0;
        this.salary = 0;
        this.isWorking = false;
        this.id = 0;
    }


    void viewEmployeeData() {
        System.out.println();

        System.out.println(getFirstname());
        System.out.println(getLastname());

        if (age == 0) {
            System.out.println("Age: N/A");
        } else {
            System.out.println("Age: " + getAge());
        }

        if (salary == 0) {
            System.out.println("Salary: N/A.");
        } else {
            System.out.println("Salary: " + getSalary());
        }

        if (isWorking == true) {
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
