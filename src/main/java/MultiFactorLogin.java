import java.util.Scanner;
public class MultiFactorLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPass = "Nikhila";
        int otp = 6789;

        System.out.println("Enter Password: ");
        String inputPass = sc.nextLine();

        if (inputPass.equals(correctPass)){
            System.out.println("Password correct! OTP sent to your phone.");
            int attempts = 3;

            while (attempts>0){
                System.out.println("Enter OTP: ");
                int inputOtp = sc.nextInt();

                if (inputOtp==otp){
                    System.out.println("Login Successful! Welcome.");
                    break;
                }
                else {
                    attempts--;
                    System.out.println("Incorrect OTP. Attempts left: " + attempts);
                }
            }

            if(attempts == 0) {
                System.out.println("OTP failed. Login blocked.");
            }
        }
        else {
            System.out.println("incorrect password");
        }
    }

}
