public abstract class AbstractBrowser {
	
protected String browserName;
	
	public  AbstractBrowser(String browserName){
		this.browserName = browserName;
	}
	
	public void logLaunch(){
		System.out.println("Logging: " + browserName + "launched");
	}
	
	public abstract void launch();
	public abstract void close();


}
