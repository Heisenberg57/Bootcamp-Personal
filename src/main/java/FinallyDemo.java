public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("This will ALWAYS run.");
        }

        System.out.println("Program ended.");
    }
}
