package com.interfac;

/**
 * @author Dropad
 *
 */
public interface Interface1 {
	
	public void engine();
	
	public void seat();
	
	public static void main(String[] args) {
		ClassNew objx = new ClassNew();
		objx.engine();
		objx.seat();
	}

}
-----------------
/**
 * @author Dropad
 *
 */
public class ClassNew implements Interface1 {

	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have engine");
	}

	public void seat() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have seat");
	}
	
	public static void main(String[] args) {
		
		ClassNew obj = new ClassNew();
		obj.engine();
		obj.seat();		
	}
}