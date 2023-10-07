package ArrayLearn;

public class Array_Primitive {
	public static void main(String args[]) {
		int[] rollNumber = new int[10];  //Array
		
		for(int i=0; i<10; i++) {
			rollNumber[i] = i+100;
		}
		String[] names = new String[10];
		names[0] = "Rohit";
		names[1] = "Ganesh";
		names[2] = "Abhi";
		names[3] = "Gaurav";
		names[4] = "Govind";
		names[5] = "Sagar";
		names[6] = "prathmesh";
		names[7] = "Amol";
		names[8] = "Akash";
		names[9] = "sahil";
		
		String Address[] = new String[10];
		Address[0] = "Nagar";
		Address[1] = "pune";
		Address[2] = "Shirdi";
		Address[3] = "Mumbai";
		Address[4] = "sangli";
		Address[5] = "satara";
		Address[6] = "Nashik";
		Address[7] = "surat";
		Address[8] = "panvel";
		Address[9] = "Malegaon";
		
		
		for(int i=0; i<10; i++) {
			System.out.println("RollNumber : "+rollNumber[i]+" "+" Name : "
		     +names[i]+" "+" Address : "+Address[i]);
		}
	}

}
