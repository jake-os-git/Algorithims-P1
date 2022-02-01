import java.util.Random;

public class test {
    public static int[] RandomizeArray(int[] array){
        Random rgen = new Random();  // Random number generator

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        RandomizeArray(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");
        }
    }
}
