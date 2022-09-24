public class MultiplicationOfTwoArrays {

    public static void main(String[] args) {
        multiplicationOfArray(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10});
    }

    public static void multiplicationOfArray(int[] array1, int[] array2){

        for (int i = 0; i < array1.length; i++){
            int multiplication = array1[i];

            for (int j = 0; j < array2.length; j++){
                multiplication = multiplication * array2[j];

            }
            System.out.println("Multiplication of numbers in: " + (i + 1) +" is: "+ multiplication);
        }

    }
}
