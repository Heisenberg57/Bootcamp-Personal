public class ChromeBrowser implements Browser{


    @Override
    public void launch() {
        System.out.println("Launching Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }
}
