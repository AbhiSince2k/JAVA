Class 1:

/**
 * @author Dropad
 *
 */
public class ClassA {

    int a = 10, b = 20;

    public void add() {
        System.out.println(a + b);

    }

    public static void main(String[] args) {
        ClassA obgA = new ClassA();
        System.out.println(obgA.a);
        obgA.add();
    }

}

Class 2:

***

@author Dropad
 *
 */
public class ClassB extends ClassA {
	/*int a = 100, b = 200;
	
	public void add() {
		System.out.println(a+b);
	}*/
	
	public static void main(String[] args) {
		ClassB objB = new ClassB();
		objB.add();
		System.out.println(objB.a);
	}

}

Class 3:

/**
 * @author Dropad
 *
 */
public class ClassC extends ClassB {

    public static void main(String[] args) {
        ClassC objC = new ClassC();
        System.out.println(objC.a);
        objC.add();
    }

}