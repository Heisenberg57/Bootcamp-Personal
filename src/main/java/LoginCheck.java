import java.util.Scanner;

public class LoginCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a username : ");
        String userInput = sc.nextLine();

        System.out.print("Enter password: ");
        String passInput = sc.nextLine();

        String correctUser = "admin";
        String correctPass = "12345";

        if(userInput.equals(correctUser) && passInput.equals(correctPass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}