class aClass{
    int[] array;
    aClass(int[] array){
        this.array = array;
    }
    void showData(){
        for(int print: array){
            System.out.println(print);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        int[] array = {1,22,33,43,53};
        aClass arx = new aClass(array);

        arx.showData();

    }
}
