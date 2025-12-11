import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        // Create multiple test cases
        TestCase tc1 = new TestCase(
                "Login Test",
                "Verify user can login with valid credentials",
                3,
                true
        );

        TestCase tc2 = new TestCase(
                "Logout Test",
                "Verify user can logout successfully",
                2,
                false
        );

        TestCase tc3 = new TestCase(
                "Add To Cart Test",
                "Verify product can be added to cart",
                4,
                true
        );

        // Store them in a list
        List<TestCase> tests = new ArrayList<>();
        tests.add(tc1);
        tests.add(tc2);
        tests.add(tc3);

        // Execute all tests
        int passCount = 0;
        int failCount = 0;

        System.out.println("======= EXECUTING ALL TEST CASES =======");

        for (TestCase test : tests) {

            test.run();  // run individual test

            if (test.getStatus().equals("PASS")) {
                passCount++;
            } else {
                failCount++;
            }
        }

        // Print summary
        System.out.println("============ TEST SUMMARY ============");
        System.out.println("Total Tests: " + tests.size());
        System.out.println("PASS: " + passCount);
        System.out.println("FAIL: " + failCount);
        System.out.println("======================================");
    }

}
