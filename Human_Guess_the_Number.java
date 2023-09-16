import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(15);
        boolean condition = true;
        System.out.println("Guess the number");

        while (condition) {
            int guess = scan.nextInt();
            if (guess < answer) {
                System.out.println("The answer is higher");
            } else if (guess > answer) {
                System.out.println("The answer is lower");
            } else {
                System.out.println("CORRECT!!!");
                condition = false; 
            }
        }
    }
}
