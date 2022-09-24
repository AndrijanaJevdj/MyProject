import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temperatureInCelsius = myObj.nextDouble();
        celsiusTofahrenheit(temperatureInCelsius);

    }
    public static double celsiusTofahrenheit(double temperatureInCelsius){
        return temperatureInCelsius * 1.8 + 32;

    }
}
