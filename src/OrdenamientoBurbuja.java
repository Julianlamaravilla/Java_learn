import java.util.List;

public class OrdenamientoBurbuja {

    public static void sortBobble(Object[] array){

        int counter = 0;
        for(int i = 0; i < array.length - 1; i ++){

            for (int j = 0 ; j < array.length -1 - i ; j ++){
                if (((Comparable<Object>)array[j + 1]).compareTo(array[j]) < 0){
                    Object auxiliary = array[j];
                    array[j] = array[j+1];
                    array[j+1] = auxiliary;
                }

                counter++;
            }
        }

        System.out.println("contador = " + counter);
    }

    public static  void main(String[] args){

        String[] products = {
                "Kigston Pendrive 64GB",
                "Sansung galaxy", "Disco Duro SSD Sansung Externo", "Asus NoteBook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"
        };

        int total = products.length;

        sortBobble(products);


        for (int i = 0; i < total ; i++){
            System.out.println("para indice " + i + " : " + products[i]);
        }
    }
}
