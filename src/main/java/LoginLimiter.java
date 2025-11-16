import java.util.Scanner;

public class LoginLimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPass = "Nikhila";
        int attempts = 3;

        while (attempts>0){
            System.out.println("Enter Password: ");
            String pass = sc.nextLine();

            if(pass.equals(correctPass)){
                System.out.println("Login Succesfull");
                break;
            }

            else {
                attempts--;
                System.out.println("Incorrect! Attempts left: " + attempts);
            }
        }

        if (attempts==0){
            System.out.println("Account Locked!");
        }
    }
}
