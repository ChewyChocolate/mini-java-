import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> index = new ArrayList<>();

        System.out.println("Enter numbers separated by spaces (Press Enter to end input):");
        String inputLine = scan.nextLine();
        System.out.println("What's the target number?");
        int n = scan.nextInt();

        // Split the input line into an array of strings
        String[] numbersAsString = inputLine.split("\\s+");

        // Convert the strings to integers and store them in an array
        int[] array = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            array[i] = Integer.parseInt(numbersAsString[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    index.add(pair);
                }
            }
        }

        for (ArrayList<Integer> pair : index) {
            System.out.println(pair.get(0) + ", " + pair.get(1));
        }
    }
}
