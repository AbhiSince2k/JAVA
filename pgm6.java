public static void main(String[] args) {
		
		int a = 100, b = 50, c = 7;
		if ((a > b) || (a > c)) {
			System.out.println("a is a big number!");
		} else {
			System.out.println("a is not a big number!");
		}


		if((a>b) && !(b>c)) {
			System.out.println("a is big number");
		} else {
			System.out.println("a is not big number");
		}


		if((a>b) && (b>c)) {
			System.out.println("a is big number");
		} else {
			System.out.println("a is not big number");
		}
		
	}