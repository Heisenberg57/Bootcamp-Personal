public class ReturnTypeDemo {

    static int addNumbers(int a,int b){
        return a+b;
    }

    static boolean isEligible(int age){
        return age>=18;
    }

    public static void main(String[] args) {
        int sum = addNumbers(10,20);
        System.out.println("Sum is: "+sum);

        boolean eligible = isEligible(21);
        System.out.println("Eligible: " + eligible);
    }
}
