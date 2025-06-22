public class FinancialForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000;    // Starting amount
        double growthRate = 0.08;       // 8% annual growth
        int years = 5;        double futureValue = FinancialForecaster.forecastFutureValue(presentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: $%.2f\n", years, futureValue);
    }
}

/*
 * ----------------------------------------
 * Concept: Recursion in Algorithms
 * ----------------------------------------
 * ➤ Recursion is a technique where a method calls itself to solve a smaller version 
 *   of the same problem until a base condition is met.
 *
 * ➤ It simplifies complex problems by breaking them down into smaller subproblems.
 *   Common use cases include mathematical computations, tree traversals, and forecasting.
 *
 * ➤ In financial forecasting, recursion can help simulate compounding growth 
 *   over multiple periods without using loops.
 */

 /*
 * ----------------------------------------
 * Time Complexity & Optimization
 * ----------------------------------------
 * ➤ Time Complexity: O(n)
 *    - The recursive function makes one call per year, so for `n` years, it performs `n` recursive calls.
 *
 * ➤ Space Complexity: O(n)
 *    - Due to the recursive call stack, space used is also linear in the number of years.
 *
 * ----------------------------------------
 * Optimization:
 * ----------------------------------------
 * ➤ Use Iteration:
 *    - Convert recursion to a loop-based approach to reduce stack usage.
 *
 * ➤ Tail Recursion:
 *    - Tail-recursive helpers (as shown in the helper method) can be optimized by compilers in some languages (not Java by default).
 *
 * ➤ Memoization (not needed here):
 *    - Useful when overlapping subproblems exist. Not necessary for this use case since values are computed once per year.
 */
