package ArrayLearn;

import java.util.ArrayList;

public class ArrayListLearning {
	public static void main(String args[]) {
		ArrayList al = new ArrayList<>();
		
		al.add("GANESH");
		al.add("KGANESH");
		al.add("Test@123");
		al.add("Test@123");
		al.add("Admin");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		System.out.println(al.remove(1));
	}

}
