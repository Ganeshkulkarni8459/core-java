package Algebra;

public class BinomialExpansion {
	public static void main(String args[]) {
		int d = Binomialpower1(2,3);
		System.out.println(d);
		int i = Binomialpower2(1,2);
		System.out.println(i);
		int j = Binomialpower3(1,2);
		System.out.println(j);
		int k = Binomialpower4(1,2);
		System.out.println(k);
		int l = Binomialpower5(1,2);
		System.out.println(l);
		
		
	}
	public static int Binomialpower1(int a,int b) {
		int c = a + b;
		return c;
	}
	public static int Binomialpower2(int a,int b) {
		int d = a*a + 2*a*b + b*b;
		return d;
	}
	public static int Binomialpower3(int a,int b) {
		int e = a*a*a + 3*a*a*b + 3*a*b*b + b*b*b;
		return e;
	}
	public static int Binomialpower4(int a,int b) {
		int f = a*a*a*a + 4*a*a*a*b + 6*a*a*b*b + 4*a*b*b*b + b*b*b*b;
		return f;
	}
	public static int Binomialpower5(int a,int b) {
		int g = a*a*a*a*a + 5*a*a*a*a*b + 10*a*a*a*b*b + 10*a*a*b*b*b + 5*a*b*b*b*b + b*b*b*b*b;
		return g;
	}

}
