import java.util.ArrayList;

public class ArrayListLoop {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Suyog");
        names.add("Valentina");
        names.add("Radha");
        names.add("Felicia");

        for(String name:names){
            System.out.println("Customer: "+name);
        }

    }
}
