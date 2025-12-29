package JavaTest;

import java.util.HashMap;
import java.util.Map;

public class ConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> config = new HashMap<>();
		
		config.put("browser", "chrome");
		config.put("env","uat");
		config.put("baseUrl", "https://uat.myapp.com");
        config.put("timeout", "10");
        
        System.out.println("Browser: " + config.get("browser"));
        System.out.println("Env: " + config.get("env"));
        System.out.println("URL: " + config.get("baseUrl"));
        System.out.println("Timeout: " + config.get("timeout"));

        
        

		

	}

}
