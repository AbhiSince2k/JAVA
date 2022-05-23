public class Rectangle {

    int length, width, result;

    public Rectangle(int x, int y) {
        length = x;
        width = y;
    }

    public void rectArea() {
        result = length * width;
        System.out.println("\n Area of Rectangle: " + result);
    }}-----------------------

Child Class:----------------

public class SubClass extends Rectangle{
	int a;
	
	public SubClass(int value) {
		super(1, 2);
		value =a;
	}
	
	public void rectArea() {
		result = length * width;
		System.out.println("\n Area of Rectangle: "+result);
		System.out.println("\n Value of a: "+a);
	}
	
	public static void main(String[] args) {
		SubClass sc = new SubClass(12);
		sc.rectArea();
	}
		
}