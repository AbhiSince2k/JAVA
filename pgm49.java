public class Class1 {
	
	private String name = "Test Automation"; 
//This string can be called/used in same class but we can not use outside of the class. So using Setters and getters we can access outside the class.
//Below is the example:

// To use set and get method; right click on class -->  Select Source --> Select Generate Getters and Setters.
//Below code(getName and setName methods) will get generated automatically.

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String newname) {
		this.name = newname;
	}
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println(obj.getName());
	}
}----------------------

public class Class2 extends Class1 {
	
	public static void main(String[] args) {
		Class2 obj2 = new Class2();
		obj2.setName("Selenium");
		System.out.println(obj2.getName());
	}

}