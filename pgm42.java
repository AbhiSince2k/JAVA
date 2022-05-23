/**
 * @author Dropad
 *
 */
public class Class1 {
    // Declare Static variables
    static int a = 10, b = 20;

    // Declare non-static variables
    int c = 30, d = 40;

    // Create a Static method with returning a value
    public static int add() {
        int result = a + b;
        return result;
    }

    // Create a Static method without returning a value
    public static void multiply() {
        System.out.println(a * b);
    }

    // Create a Non-Static method with returning a value
    public int add2() {
        int res = c + d;
        return res;
    }

    // Create a Non-Static method without returning a value
    public void multiply2() {
        System.out.println(c * d);
    }

    public static void main(String[] args) {
        // Access static class members (using class name)
        int x = Class1.add();
        System.out.println(x);

        System.out.println(Class1.a);

        Class1.multiply();

        // Access static class members (using class name)
        Class1 cls = new Class1();
        System.out.println(cls.add2());

        System.out.println(cls.c);

        cls.multiply2();

    }

}