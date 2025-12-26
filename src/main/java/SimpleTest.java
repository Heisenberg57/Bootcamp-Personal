public class SimpleTest {

    String name;
    boolean result;

    public SimpleTest(String name,boolean result){
        this.name = name;
        this.result = result;
    }

    public void run(){
        System.out.println( "Test: " + name + " -> " + (result ? "PASS" : "FAIL"));
    }
}
