public class InterfaceRunner {
    public static void main(String[] args) {
        Browser browser;

        browser = new ChromeBrowser();
        browser.launch();
        browser.close();

        System.out.println();

        browser = new FirefoxBrowser();
        browser.launch();
        browser.close();
    }
}
