public class MultiCatchDemo {
    public static void main(String[] args) {
        try{
            int[] nums = {1,2,3};
            System.out.println(nums[5]);  //out of bonds

            int a = 10/0;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index issue: " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }

        System.out.println("Still running...");
    }
}
