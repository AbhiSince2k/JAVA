package com.inheritence;

/**
 * @author Dropad
 *
 */
public class ClassX {
	
	protected int a = 10, b = 20;
	
	protected void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		ClassX objX = new ClassX();
		System.out.println(objX.a);
		objX.add();
	}

}----------------
package com.inheritence1;

import com.inheritence.ClassX;

/**
 * @author Dropad
 *
 */
public class ClassZ extends ClassX {

    public static void main(String[] args) {

        ClassZ objZ = new ClassZ();
        objZ.add();
        System.out.println(objZ.a);

    }

}