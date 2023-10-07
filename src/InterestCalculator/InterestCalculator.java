package InterestCalculator;
import java.util.*;
public class InterestCalculator {
	public static void main(String args[]) {
		System.out.println("###### Welcome To Interest Calculator ######");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Principle Amount =");
		int PA = sc.nextInt();
		
		System.out.println("Interest Rate =");
		float IR = sc.nextFloat();
		
		System.out.println("Time in years =");
		Float Time = sc.nextFloat();
		
		System.out.println("Interest Amount is = "+(PA * IR * Time)/100);
	}

}
