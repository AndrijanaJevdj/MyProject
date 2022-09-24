import java.util.Scanner;

public class FizzBuzz {


    public static void main(String[] args) {

        Scanner myObj= new Scanner(System.in);

        System.out.println("Enter the lower limit:  " );
        int lowerLimit = myObj.nextInt();
        System.out.println("Enter the upper limit: ");
        int upperLimit = myObj.nextInt();
        fizzBuzz(lowerLimit, upperLimit);
    }
    public static void fizzBuzz(int lowerLimit, int upperLimit) {

        for (int i = lowerLimit; i< upperLimit +1; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }else {
                System.out.println(i);
            }

        }
    }
}
