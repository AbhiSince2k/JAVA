public static void main(String[] args) {
		
		String [] arr = {"Aaaple", "Ball", "Food", "Jam"};
		for (String value : arr) {
			System.out.println(value);
		}
	}
---------------
public static void main(String[] args) {
		
		int [] math = new int[3];
		int a = 10, b = 20;
		math[0] = a + b;
		math[1] = a - b;
		math[2] = a * b;
		for (int i : math) {
			System.out.println(i);
			
		}
	}