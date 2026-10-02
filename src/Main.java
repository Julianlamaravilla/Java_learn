
public static void main(String[] args){



    // second exercise

    int counter = 0;

    int[] numbers = new int[4];

    numbers[0] = 10;
    numbers[1] = Integer.valueOf("7");
    numbers[2] = 35;
    numbers[3] = -1;

    for (int i = 0; i < numbers.length - 1; i ++){

        for (int j = 0 ; j < numbers.length -1 - i ; j ++){
            if (((Integer)numbers[j + 1]).compareTo(numbers[j]) < 0){
                int auxiliary = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = auxiliary;
            }

            counter++;
        }
    }

    for (int i = 0; i < numbers.length ; i ++){
        System.out.println("i = " + i + " : " + numbers[i]) ;
    }
}
