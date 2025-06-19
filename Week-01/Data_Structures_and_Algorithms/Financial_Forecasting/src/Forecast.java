public class Forecast {

    public static double futureValue(int years, double initialValue, double growthRate) {
        if (years == 0) {
            return initialValue;
        }
        return futureValue(years - 1, initialValue, growthRate) * (1 + growthRate);
    }
}
