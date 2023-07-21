class aClass{
    int[] array;
    aClass(int[] array){
        this.array = array;
    }
    void showData(){
        for (int print : array ) 
        System.out.println(print);
    }
}
public class Main
{
	public static void main(String[] args) {
		int[] array1 = {1, 6, 43, 345, 22, 55, 63};
		int[] array2 = {2, 4, 63, 65, 342, 565, 263};
		int[] array3 = {3, 3, 356, 74, 32, 5, 83};
		aClass arxA = new aClass(array1);
		aClass arxB = new aClass(array2);
		aClass arxC = new aClass(array3);
		arxA.showData();
		System.out.println();
		arxB.showData();
		System.out.println();
		arxC.showData();
	}
}
