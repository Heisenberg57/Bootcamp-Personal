public class NotifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Notifier notifier = new EmailNotifier();
		notifier.send("Build failed!");


	}

}
