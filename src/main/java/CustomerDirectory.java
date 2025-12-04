import java.util.HashMap;

public class CustomerDirectory {
    public static void main(String[] args) {

        HashMap<Integer,String> customers = new HashMap<>();

        customers.put(101,"Suyog");
        customers.put(202,"Valentina");
        customers.put(303, "Priya");
        customers.put(404, "Jordan");

        System.out.println("=== Customer Directory ===");
        System.out.println(customers);

        System.out.println("Customer 202: "+customers.get(202));

    }
}
