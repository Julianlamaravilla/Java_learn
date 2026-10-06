import java.util.Scanner;

public class EArrayPairInPair {

    public static void main(String[] args){

        int[] a , pair , impair;
        int totalPair = 0, totalImPair = 0;
        a = new int[10];
        Scanner s = new Scanner(System.in);


        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < a.length; i++){
           a[i] = s.nextInt();
        }


        for(int i : a){
            if(i %2 == 0){
                totalPair++;
            } else {
                totalImPair++;
            }
        }

        pair = new int[totalPair];
        impair = new int[totalImPair];

        int j = 0;
        int k = 0;

        for(int i : a){
            if(i % 2 == 0){
                pair[j++] = i;
            } else {
                impair[k++] = i;
            }
        }

        System.out.println("pair");
        for(int i : pair){
            System.out.print(i + " ");
        }

        System.out.println("\r\nImpair");
        for(int i : pair){
            System.out.print(i + " ");
        }
        System.out.print(" ");
    }
}