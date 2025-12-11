public class ThrowThrowsDemo {

    static void checkAge(int age) throws Exception{
        if(age<18){
            throw new Exception("You must be 18+");
        }
        System.out.println("Age verified!");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
