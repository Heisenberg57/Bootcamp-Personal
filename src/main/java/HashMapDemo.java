import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customers = new HashMap<>();

        customers.put(101,"Suyog");
        customers.put(202,"Valentina");
        customers.put(303,"Radha");

        System.out.println(customers);
    }
}
