import java.util.Scanner;

class Student {
    String fName;
    String lName;
    String sNo;

    Student(String a, String b, String c) {
        fName = a;
        lName = b;
        sNo = c;
    }

    void showInfo() {
        System.out.println("Student Name: " + fName + ' ' + lName);
        System.out.println("Student No: " + sNo);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] student = new Student[5];
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter First Name: ");
            String firstName = scan.nextLine();
            
            System.out.print("Enter Last Name: ");
            String lastName = scan.nextLine();

            System.out.print("Enter Student Number: ");
            String studentNumber = scan.nextLine();
            
            System.out.print("\033[H\033[2J");
            student[i] = new Student(firstName, lastName, studentNumber);
        }
        for(int i = 0; i < 5; i++){
            student[i].showInfo();
            System.out.println();
        }
    }
}
