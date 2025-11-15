import java.util.Scanner;

public class SmartLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        String correctUser = "admin";
        String correctPass = "12345";

        if(user.equals(correctUser)) {

            if(pass.equals(correctPass)) {
                System.out.println("Login Successful! Welcome, " + user);
            } else {
                System.out.println("Password Incorrect!");
            }

        } else {
            System.out.println("Username Incorrect!");
        }

    }
}
