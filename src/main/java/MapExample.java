import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> testResults = new HashMap<>();

        testResults.put("Login Test", "PASS");
        testResults.put("Logout Test", "FAIL");

        System.out.println("Login Test Status: " + testResults.get("Login Test"));
    }
}
