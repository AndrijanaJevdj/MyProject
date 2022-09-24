import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnElementAtASpecifiedIndex {
    public static int[] insertElement(int[] array, int element, int index) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length + 1; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[i - 1];
            }
        }


        return newArray;
    }


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int element = myObj.nextInt();
        int index = myObj.nextInt();
        int[] array = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(insertElement(array,element,index)));

    }
}
