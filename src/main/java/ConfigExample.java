import java.util.HashMap;
import java.util.Map;

public class ConfigExample {
    public static void main(String[] args) {
        Map<String,String> config = new HashMap<>();

        config.put("browser","chrome");
        config.put("env","uat");
        config.put("baseUrl","https://example.com");

        System.out.println("Browser: " + config.get("browser"));
        System.out.println("Environment: " + config.get("env"));
        System.out.println("Base URL: " + config.get("baseUrl"));
    }
}
