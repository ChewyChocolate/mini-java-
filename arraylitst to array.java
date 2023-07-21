import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[arrayList.size()]);

        // Print the elements of the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}
