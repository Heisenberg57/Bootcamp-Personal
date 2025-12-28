public class SimpleTest {

    String name;
    boolean result;

    public SimpleTest(String name,boolean result){
        this.name = name;
        this.result = result;
    }

    public void run(){
        System.out.println("[INFO] Running test: " + name);

        try {
            System.out.println("[INFO] Executing test steps");
            // test logic here

            System.out.println("[INFO] Test result: PASS");
        } catch (Exception e) {
            System.out.println("[ERROR] Test crashed: " + name);
            System.out.println("[ERROR] Reason: " + e.getMessage());
            throw e;
        }
    }
}
