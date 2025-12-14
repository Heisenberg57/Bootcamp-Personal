public class SafeCalculatorTest {

    public static void main(String[] args) {

        try {
            int result = SafeCalculator.divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (InvalidOperationException e) {
            System.out.println("Calculation failed: " + e.getMessage());
        }
        finally {
            System.out.println("Test execution completed.");
        }
    }
}
