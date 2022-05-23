public static int a; // Static variable
	public static int b; // Static Variable
	public int add() {
		int result;
		result = a+b;
		return result;
	}
	
	public static int multiply() {
		int res = a*b;
		return res;
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods(); //Create an object to call non static methods, variables.
		a = 10; // declared the values for static variable a
		b = 20; // declared the values for static variable b
		System.out.println(obj.add()); // Calling non-static method add using object created for the class.
		int x = obj.add(); // Storing the ouput of add in variable x.
		System.out.println(x); // Printing the output of x.
		int y = multiply(); // Storing the ouput of multiply in variable y.
		System.out.println(y); // Printing the output of y.
	}