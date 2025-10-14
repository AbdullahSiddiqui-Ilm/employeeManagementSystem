import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    int age;
    int salary;
    boolean isWorking;
    int id;

    Employee(String firstname, String lastname, int age, int salary, boolean isWorking, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.isWorking = false;
        this.id = id;
    }

     boolean changeWorking() {
         System.out.print("Please enter 'Yes' to confirm that you have started your shift:  ");

         Scanner sc = new Scanner(System.in);
         String change = sc.nextLine();

         if (change.toUpperCase().equals("YES")) {
             isWorking = true;
             System.out.println("Enjoy your shift");
         } else if (change.toUpperCase().equals("NO")) {
             isWorking = false;
         } else {
             System.out.println("Invalid Input");
         }

         sc.close();
         return isWorking;
     }



     void viewEmployeeData(){
         System.out.println();
         System.out.println("Here is info regarding employee no. " + this.id + ":");
         System.out.println("" + this.firstname);
         System.out.println("" + this.lastname);
         System.out.println("" + this.age);
         System.out.println("" + this.salary);
         System.out.println("" + this.isWorking);
     }

}
