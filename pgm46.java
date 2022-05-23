/**
 * @author Dropad
 *
 */
public class ClassNew1 {
	
	public void myMethod() {
		System.out.println("Selenium for Test Automation");
		
	}
	
	public static void main(String[] args) {
		ClassNew1 obj = new ClassNew1();
		obj.myMethod();
		
	}

}
----------------
/**
 * @author Dropad
 *
 */
public class ClassNew2 extends ClassNew1{
	
	public void myMethod() {
		System.out.println("UFT for Test Automation");
	}
	
	public static void main(String[] args) {
		ClassNew2 obj = new ClassNew2();
		obj.myMethod();
		ClassNew1 obj1 = new ClassNew1();
		obj1.myMethod();
		
	}

}
