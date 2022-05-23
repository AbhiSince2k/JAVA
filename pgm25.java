public static void main(String[] args) {

		String str1 = "SELENIUM";
		String str2 = "selenium";
		String str3 = "SELENIUM"; 
		String str4 = "zselenium";
		
		//string comparison using == Relational operator
		
		System.out.println(str1==str2);
		System.out.println(str1 == str3);
		
		//string comparison using equals() method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//string comparison using compareTo() method
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str4));
	}
