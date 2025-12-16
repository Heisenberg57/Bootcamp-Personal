
public interface Drivable {
	void drive();
}

class Car implements Drivable{
	public void drive() {
		System.out.println("Car is driving");
	}
}
