import java.util.ArrayList;
import java.util.Scanner;

class StudentName{
    String name;
    StudentName(String name){
        this.name = name;
    }
    void showName(){
        System.out.println(name);
    } 
}

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<StudentName> names = new ArrayList<>();
        boolean cond = true;
        
        while(cond){
            String lName = scan.nextLine();
            if(lName.equals("stop")){
                System.out.print("\033[H\033[2J");
                cond = false;
            }
            else{
                names.add( new StudentName(lName));
            }
        }
        
        for(StudentName pogi : names){
            pogi.showName();
            System.out.println();
        }
    }
}
