public class SafeCalculator {

    static int divide(int a, int b) throws InvalidOperationException{
        if(b == 0) {
            throw new InvalidOperationException("Division by zero is not allowed");
        }
        return a / b;
    }
}
