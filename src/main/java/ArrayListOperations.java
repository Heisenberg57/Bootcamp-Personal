import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();

        customers.add("Suyog");
        customers.add("Priya");
        customers.add("Radha");
        customers.add("Nikhila");

        System.out.println("All Customers"+customers);

        System.out.println("Customer at index 1: " + customers.get(1));

        customers.set(1,"Valentina");
        System.out.println("Updated list: " + customers);

        // remove value
        customers.remove("Suyog");
        System.out.println("After removal: " + customers);

        System.out.println("Total customers: " + customers.size());
    }
}
