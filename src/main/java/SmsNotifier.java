
public class SmsNotifier implements Notifier{

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		System.out.println("Validating SMS config...");
		return true;
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS:"+message);
		
	}

}
