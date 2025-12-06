public class TryCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;    // will cause exception
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}
