import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Set: use when uniqueness matters (e.g. browsers)
        Set<String> browsers = new HashSet<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Chrome"); // duplicate

        System.out.println(browsers);
    }
}
