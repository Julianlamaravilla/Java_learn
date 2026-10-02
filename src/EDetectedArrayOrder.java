import java.util.Scanner;

public class EDetectedArrayOrder {

    public static void main(String[] args){

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);


        System.out.println("Enter 7 numbers: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }


        boolean upward = false;
        boolean falling = false;
        for(int i = 0; i < a.length - 1; i++){

            if (a[i] > a[i + 1]){
                falling = true;
            }

            if (a[i] < a[i + 1]){
                upward = true;
            }
        }

        if (upward && falling){
            System.out.println("Array = unordered");
        } else if (upward == false && falling == false) {
            System.out.println("Array = Alll items are equal");
        } else if (upward == true && falling == false) {
            System.out.println("Array =  sorted in ascending Order");
        } else if (upward == false && falling == true) {
            System.out.println("Array = sorted in descending Order");
        }
    }
}
