// Calling a non static method from another class.
// Create an object for the class and using that object call the non static method

public static void main(String [] args) {
		Sample sam = new Sample();
		sam.studentRank(600);
	}
----------------------
public static void main(String [] args) {

//Using class name you may call a method from different class if the method is the static method. use below syntax:
// classname.methodname;
		Sample.studentRank(600); 

	}