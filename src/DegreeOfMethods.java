public class DegreeOfMethods {
    public static void main(String[] args) {

        System.out.println(exponentiationOfNumbers(-2,-3));
        // 2 3= 2 * 2 * 2=8
    }
    public static double exponentiationOfNumbers(double number, int exponent){


        double result = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {

            result = result * number;
        }
        if (exponent < 0){
            result = 1 / result;
        }
        return result;

    }

}
