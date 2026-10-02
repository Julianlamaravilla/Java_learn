import java.util.Arrays;
import java.util.Scanner;

public class ExampleArrayLargerNumber {

    public static void main(String[] args){


        int[] a = new int[5];
        Scanner s = new Scanner(System.in);


        //  Logic for user can enter numbers to the array a
        System.out.println("Enter 5 Integers: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();

        }


        // Logic to search the large number
        int max = 0;
        for(int i = 0; i < a.length; i ++){
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("a = " + a[max]);
    }
}
