public interface Notifier {
	
	boolean validate();
	
	void send(String message);

}
