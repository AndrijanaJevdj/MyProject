import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = myObj.nextInt();

        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
