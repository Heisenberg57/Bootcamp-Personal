import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> testNames = new ArrayList<>();

        testNames.add("Login Test");
        testNames.add("Logout Test");
        testNames.add("Add To Cart Test");

        for (String test : testNames) {
            System.out.println("Executing: " + test);
        }

    }
}
