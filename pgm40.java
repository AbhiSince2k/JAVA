// Parameterized constructor:

public class Rectangle {

    int length, width, result;

    public Rectangle(int x, int y) {
        length = x;
        width = y;
    }

    public void rectArea() {
        result = length * width;
        System.out.println("\n Area of Rectangle: " + result);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(12, 10);
        obj.rectArea();
    }
}

-----------------------------------------

class Const_Example{
   //Default constructor
   Const_Example(){
      System.out.println("Default constructor");
   }
   /* Parameterized constructor with 
    * two integer arguments
    */
   Const_Example(int i, int j){
      System.out.println("constructor with Two parameters");
   }
   /* Parameterized constructor with 
    * three integer arguments
    */
   Const_Example(int i, int j, int k){
      System.out.println("constructor with Three parameters");	      
   }
	   
   /* Parameterized constructor with 
    * two arguments, int and String
    */
   Const_Example(int i, String name){
      System.out.println("constructor with int and String param");
   }
   public static void main(String args[]){
      //This will invoke default constructor
      Example obj = new Example();

      /* This will invoke the constructor 
       * with two int parameters
       */
      Example obj2 = new Example(12, 12);

      /* This will invoke the constructor 
       * with three int parameters
       */
      Example obj3 = new Example(1, 2, 13);
	
      /* This will invoke the constructor 
       * with int and String parameters
       */
      Example obj4 = new Example(1,"BeginnersBook");
   }
}
