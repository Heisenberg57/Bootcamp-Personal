import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();

        customers.add("Suyog");
        customers.add("Valentina");
        customers.add("Radha");
        customers.add("Nikhila");

        System.out.println("All Customers"+customers);

        System.out.println("Customer at index 1: " + customers.get(1));
    }
}
