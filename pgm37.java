Super class:
public class Methods{

int a=10, b=2;
	
	public int add() {
		int results = a + b;
		return results;
	}
}
	
Sub class:
public class Methods2 extends Methods{

int a = 100, b = 200;
	public int add() {
		int results = a + b;
		return results;
	}
	 
	public static void main(String [] args) {
		Methods2 obj = new Methods2();
		int x = obj.add();
		System.out.println(x);
		
		Methods fg = new Methods();
		int a = fg.add();
		System.out.println(a);
		
	}
}