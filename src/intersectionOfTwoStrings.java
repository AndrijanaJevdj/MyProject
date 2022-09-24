import java.util.Arrays;

public class intersectionOfTwoStrings {

    public static void main(String[] args) {

        counterOfTheSame(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6});

    }

    public static int[] counterOfTheSame(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                    break;
                }
            }
        }

        int[] newArray = new int[counter];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    newArray[k] = array2[j];
                    k++;

                }

            }

        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
