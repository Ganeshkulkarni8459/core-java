package StringLearning;

import java.util.Scanner;

public class Function {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name :");
		
		String name = sc.nextLine();
//		
//		if(name.equalsIgnoreCase("Ganesh")) {
//			System.out.println("Name Enter is Ganesh");
//		}
//		else {
//			System.out.println("Name Enter is NOT Ganesh");
//		}
//		
//		name = "Mr. ".concat(name);
//		System.out.println(name);
//		if(name.contains("Kulkarni")) {
//			System.out.println("Part of kulkarni family");
//		}
//		else {
//			System.out.println("NOT part of kulkarni family");
//		}
//		
//		if(name.endsWith("Kulkarni")) {
//			System.out.println("Part of kulkarni family");
//		}
//		else {
//			System.out.println("NOT part of kulkarni family");
//		}
//		
//		System.out.println(name.length());
//		
//		System.out.println(name.replace(" ",""));
		
		String[] tukade = name.split("@");
		
		System.out.println("UserName - "+tukade[0]);
		
		System.out.println("Domain - "+tukade[1]);
		
		System.out.println(name.trim());
		
//		System.out.println(name.toUpperCase());
//		
//		System.out.println(name.toLowerCase());
	
	
    }
	

}
