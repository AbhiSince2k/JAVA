//DEFAULT CONSTRUCTOR
public class Student {

    int a, b; /*
               * This type of variables are called instance variable; whenever
               * object of the class is created one copy of this variable gets created
               */

    public Student() {
        System.out.println("This is a default constructor");
        a = 10;
        b = 12;
    }

    public void disply() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public static void main(String[] args) {
		Student st = new Student();
		st.disply();
	}