Abstract class
----------------
public abstract class Bike {
	
	public void handle() {
		System.out.println("It has handle");
	}
	
	public void seat() {
		System.out.println("It has handle");
	}
	
	public abstract void engine();
	
	public abstract void wheel();
	
	public static void main(String[] args) {
//		Bike objB = new Bike();
		
		RoyalEnfield obj = new RoyalEnfield();
		obj.engine();
		obj.wheel();
	}

}
------------------------
Child class
------------
public class RoyalEnfield extends Bike {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have engine");		
	}

	@Override
	public void wheel() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have wheel");
	}
	
	public static void main(String[] args) {
		RoyalEnfield obj = new RoyalEnfield();
		obj.engine();
		obj.seat();
		obj.wheel();
		obj.handle();
	}
}