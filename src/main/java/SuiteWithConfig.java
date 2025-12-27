import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuiteWithConfig {
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("env", "UAT");

        List<SimpleTest> tests = new ArrayList<>();
        tests.add(new SimpleTest("Login Test", true));
        tests.add(new SimpleTest("Checkout Test", true));

        System.out.println("Running tests on environment: " + config.get("env"));

        for (SimpleTest test : tests) {
            test.run();
        }

    }
}
