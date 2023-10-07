package Interface_Implementation;

public class Game{
	
	public static void main(String args[]) {
		
		Animal t1 = new Tiger();
		t1.sleep();
		t1.name = "Shere Khan";
		t1.walk();
		
		t1.walk("Mr. ");
		t1.walk(2, "MR. ");
		
	}
}
