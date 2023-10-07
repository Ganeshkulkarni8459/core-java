package Algebra;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		int c = multiplication(4,5);
		System.out.println(c);
		    // square
		int square = multiplication(5,5);
		System.out.println(square);
		    // cube
		int cube = multiplication(square,5);
		System.out.println(cube);
		int d = Addition(45,3);
		System.out.println(d);
		int p = Substraction(90,80);
		System.out.println(p);
		int l = QuadracticEq(7,2);
		System.out.println(l);
		
	}
	public static int multiplication(int a , int b) {
		int d = a*b;
		return d;
	}
	public static int  Addition(int a ,int  b) {
		int f = a + b;
		return f;
	}
	public static int  Substraction(int a ,int  b) {
		int g = a - b;
		return g;
	}
	public static int  QuadracticEq(int a ,int  b) {
		int x = a*a + b*b + 2*a*b;
		return x;
	}


}
