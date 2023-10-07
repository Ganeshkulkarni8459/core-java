package StringLearning;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			int n = str.length();
			if(str.charAt(i) != str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		
		System.out.println(palindrome(str));	
	}

}
