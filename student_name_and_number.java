import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String fName;
    String lName;
    String sNo;

    Student(String fName, String lName, String sNo) {
        this.fName = fName;
        this.lName = lName;
        this.sNo = sNo;
    }

    void showInfo() {
        System.out.println("Student Name: " + fName + ' ' + lName);
        System.out.println("Student No: " + sNo);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean cond = true;
        
        while(cond) {
            System.out.print("Enter First Name: ");
            String firstName = scan.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scan.nextLine();

            System.out.print("Enter Student Number: ");
            String studentNumber = scan.nextLine();

            System.out.print("\033[H\033[2J");
            students.add(new Student(firstName, lastName, studentNumber));
            
            System.out.println("Do you want to register another student?");
            String response = scan.nextLine();
            System.out.print("\033[H\033[2J");
            if(!response.equals("yes")){
                cond = false;
            }
        }

        for (Student student : students) {
            student.showInfo();
            System.out.println();
        }
    }
}
