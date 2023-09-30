import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int left = 0;
        int right = 100;
        int guess = (left + right) / 2; 
        int ans;

        while (true) {
            System.out.print("\033[H\033[2J"); 
            System.out.println("My guess is " + guess);
            System.out.println("1. If the answer is lower");
            System.out.println("2. If the answer is higher");
            System.out.println("3. If the answer is correct");

            ans = scan.nextInt();

            if (ans == 1) {
                right = guess - 1; 
                guess = (left + right) / 2;
            } else if (ans == 2) {
                left = guess + 1;
                guess = (left + right) / 2;
            } else if (ans == 3) {
                System.out.println("The answer is correct!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
            }
        }
    }
}
