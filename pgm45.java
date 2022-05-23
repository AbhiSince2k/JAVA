/**
 * @author Dropad
 *
 */
public class MethodOverLoading {
	
		public void add(int a, int b) {
			System.out.println(a + b);
		}
		
		public void add(int a, int b, int c) {
			System.out.println(a + b + c);
		}
		
		public void add(double a, double b) {
			System.out.println(a + b);
		}
			
		public static void main(String[] args) {
			MethodOverLoading obj = new MethodOverLoading();
			obj.add(10, 10);
			obj.add(10, 20, 30);
			obj.add(1.234, 2.456);
			
		}

}