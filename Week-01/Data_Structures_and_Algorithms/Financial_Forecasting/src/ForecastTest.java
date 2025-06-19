import java.util.Scanner;

public class ForecastTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter growth rate (in decimal, e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double result = Forecast.futureValue(years, initialValue, growthRate);
        System.out.println("Future value after " + years + " years is " + result);
    }
}
