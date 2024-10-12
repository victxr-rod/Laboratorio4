/**
 * Idiota
 */
public class Idiota {

    public static void main(String[] args) {
        System.out.println("Idiota");


        int key = 0;
        int[] arr = {1, 2, 3, 4, 5};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }
}