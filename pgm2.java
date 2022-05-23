/**
 * 
 */
package com.java;

import java.io.Console;
import java.lang.*;

/**
 * @author Dropad
 *
 */
public class Sample2 {

    public static void main(String[] args) {

        int a = 10, b, c; // Declaration of variables
        b = 20; // Initialization
        System.out.println(a + b);
        System.out.println("Addistion of a & b is: " + (a + b));
        final int money = 100; // Declaration of constants

        if (a > b) {
            System.out.println("A is big number");

        } else {
            System.out.println("B is big numebr \n");
        }
        for (c = 0; c <= 10; c++) {
            System.out.println(c);
        }
    }

}
public static void main(String[] args) {
		int a = 10;
		System.out.println(a); //10
		a += 10;
		System.out.println(a);
		a -= 10;
		System.out.println(a);
		a *= 5;
		System.out.println(a);