public class FirefoxBrowser implements Browser{
    @Override
    public void launch() {
        System.out.println("Launching Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox browser");

    }
}
