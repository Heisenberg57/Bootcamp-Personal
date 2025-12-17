
public class EmailNotifier implements Notifier{

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		System.out.println("Validating Email Config...");
		return true;
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending EMAIL: "+message);
		
	}

}
