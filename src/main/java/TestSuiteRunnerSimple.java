import java.util.ArrayList;
import java.util.List;

public class TestSuiteRunnerSimple {
    public static void main(String[] args) {
        List<SimpleTest> tests = new ArrayList<>();

        tests.add(new SimpleTest("Login Test",true));
        tests.add(new SimpleTest("Logout Test",false));
        tests.add(new SimpleTest("Add to Cart Test",true));

        for (SimpleTest test : tests) {
            test.run();
        }
    }
}
