public class ExampleArrayStartFinalOrden {

    public static void main(String[] args){

        int[] numbers = new int[10];
        int[] a = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numbers.length/2; i++){
            a[aux++] = numbers[i];
            a[aux++] = numbers[numbers.length -1 -i];
            System.out.print(numbers[i] + " ");
            System.out.println(numbers[numbers.length -1 -i]);
        }


        for(int i = 0; i < a.length; i++){
            System.out.println("i = " + i + " valor: " + a[i]);
        }
    }
}
