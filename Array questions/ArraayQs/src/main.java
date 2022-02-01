import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//fartssssssss
public class main {


    //Q1
    public static void average() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int length = my_array.length;
        int total = 0;
        for (int i = 0; i < length; i++) {
            total += my_array[i];
        }
        double average = total / length;
        System.out.println(average);
    }

    //Q2
    public static int getIndexOf(int Arr[], int x) {
        boolean found = false;
        int theNumber = -1;

        for (int i = 0; i < Arr.length; i++) {

            if (x == Arr[i]) {
                found = true;
                theNumber = i;
                if (found) {
                    break;
                }

            }


        }
        return theNumber;
    }

    //Q3
    public static String[] getCommonElements(String arr1[], String arr2[]) {
        int counti = 0;
        String[] commonFellas = new String[20];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    commonFellas[counti] = arr2[j];
                    counti++;
                }
            }

        }
        return commonFellas;
    }

    //Q4
    // matrix adddition is super easy
    public static int[][] addMatrices(int mat1[][], int mat2[][]) {
        int biggerMatrix[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                biggerMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return biggerMatrix;
    }

    //Q10
    public static void shuffleArray() {
        int[] inserted = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 6 ints between 0 and 10");
        int[] var2 = inserted;
        int var3 = inserted.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            inserted[i] = sc.nextInt();

        }

        System.out.println("Thanks!");

        Random rnd = new Random();

        //fill array
//        for(int i=0;i<size+1;i++){
//            inserted[i] = i + 1;
//            System.out.println(i);
//        }
        //shuffle that bitch
        for(int i=0;i< inserted.length;i++){
            int shuffler = rnd.nextInt(inserted.length);
            int temp = inserted[i];
            inserted[i] =  inserted[shuffler];
            inserted[shuffler] = temp;

        }
        System.out.println("Heres your shuffled array!");
        System.out.print("[");
        for (int i = 0; i < inserted.length; i++) {

            System.out.print(inserted[i]+ " ");
        }
        System.out.println("]");



    }


    public static void main(String[] args) {


        shuffleArray();





    }
}
//        int m = 5, n = 5;
//
//        int mat1[][] = new int[m][n];
//        int mat2[][] = new int[m][n];
//
//
//        // initialise the matrices randomly , something like this:
//        Random rnd = new Random();
//        for (int i = 0; i < 5; i++)
//            for (int j = 0; j < 5; j++) {
//                mat1[i][j] = rnd.nextInt(10);
//                mat2[i][j] = rnd.nextInt(10);
//            }
//
//
//
//
//        int sum[][] = addMatrices(mat1,mat2);
//
//        for(int i=0;i<5;i++){
//            for(int j=0; j<5 ; j++){
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }}
// print sum

//        String[] array1 = {"nail", "cure", "vagabond","riddle","act", " songs", "zipper", "excite","magical", "eager","blood","coast",
//        "guess", "selfish","milky","ticket","authority"};
//
//        String[] array2 = {"cure","wicked", "guess", "vagabond","riddle",
//                "act", "excite","songs", "troubled", "eager","blood","coast",
//                "waiting", "selfish","milky","ticket","authority", "nail"};
//
//        String[] common = getCommonElements(array1, array2); //your code
//
//        System.out.println(Arrays.asList(common));


//average();
//        int [] arr = {90, 77, 67, 55, 75, 57, 98, 17, 50, 23, 30, 100, 34,
//                75, 28, 43, 14, 52, 64, 13};
//        int x = 77;
//        int indexOf = getIndexOf(arr, x); // your function
//        System.out.println("index of " + x + " : " + indexOf);
//        System.out.println(arr.length);


