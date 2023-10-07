package ArrayLearn;

public class ArrayUserDefined {
	public static void main(String args[]) {
		Student[] student = new Student[10];
		
		for(int i=0; i<10; i++) {
			student[i] = new Student();
			student[i].RollNumber = 100 + i;
			student[i].address = "address" + i;
			student[i].names = "name" + i;
			student[i].email = "Email" + i;
			student[i].mobile = "Mobile" + i;
			
		}
		for(int i=0; i<10; i++) {
			System.out.println("RollNumber :"+ student[i].RollNumber + " Name :"+ student[i].names + " Address :"+ student[i].address);
		}
		
	}
	

}
