public static void main(String[] args) {
		int val = 10;
		if ((val <= 100) && (val >= 1)) {
			System.out.println("value is in between 1 to 100");
		}
		else if ((val > 100) && (val <=1000)) {
			System.out.println("Value is medium number!");
		}
		else if ((val >  1000) && (val < 10000)) {
			System.out.println("value is big number");
		} else {
			System.out.println("Value is either zero or negative");
		}
 }