package HashMap;

public class Temp {

	@Override
	public String toString() {
		return "Temp";
	}
	@Override
	public void finalize() {
		System.out.println("finalize method get called");
	}
}
