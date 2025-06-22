public class FinancialForecaster {

    public static double forecastFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double forecastTailRecursive(double presentValue, double growthRate, int years) {
        return helper(presentValue, growthRate, years);
    }

    private static double helper(double currentValue, double rate, int remainingYears) {
        if (remainingYears == 0) {
            return currentValue;
        }
        return helper(currentValue * (1 + rate), rate, remainingYears - 1);
    }
}
