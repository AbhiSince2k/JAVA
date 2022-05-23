public static void main(String[] args) {
		
		String str1 = "Test", str2 = "QTP", str3 = "Selenium";
		System.out.println(str3.toUpperCase());
		System.out.println(str3.length());
		System.out.println(str1.toLowerCase());
	
		String a = " Abcd ", b = "abbcd";

		System.out.println(a.charAt(0));
		System.out.println(a.startsWith("A")); //true
		System.out.println(a.endsWith("C"));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a);
		System.out.println(a.trim());
}

Print Multi Dimensional Array using nested for loop:

public static void main(String[] args) {
		int array[][] = {{1,2,3,10},{4,5,6,12},{7,8,9,15}};
// 		Using Nested For loop:
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
//		Using Nested For each loop:
		for(int[] arr: array) {
			for(int arr1: arr) {
				System.out.print(arr1+" ");
			}
			System.out.println();
		}
		
	}

---------------------------------------------------------------------------------
Convert String to array:
public static void main(String[] args) {
		String s1="Welcome to Bangalore";
		String str = new String("Test");
		System.out.println(str);
		char[] ch=s1.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch.length);
		for(int i=0;i<ch.length;i++){
		System.out.println(ch[i]);
		}
