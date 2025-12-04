import java.util.HashMap;
import java.util.Map;

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

        System.out.println("\n--- Loop using keySet() ---");

        for(Integer id: customers.keySet()){
            System.out.println(id+ " -> "+ customers.get(id) );
        } //getting key values.

        System.out.println("\n--- Loop using entrySet");

        for(Map.Entry<Integer, String> entry : customers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
