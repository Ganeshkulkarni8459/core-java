package Interface_Implementation;

public class Animal extends AbstractClass implements IAnimal {
	String name;
	String color;
	String weight;
	String age;
	
	public void Hunt() {//concrete method - contains method definition in class
		System.out.println(name+" is Hunting");
	}
	public void sleep() {
		System.out.println(name+" is sleeping");
	}
	@Override
	public void Eat() {
		System.out.println(name+" is Eating");
	}
	public void Drink() {
		System.out.println(name+" is Drinking water");
	}
	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void life() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(name+" is walking");
	}
	public void walk(String initials) {
		// TODO Auto-generated method stub
		System.out.println(initials +name+" is walking");
	}
	public void walk(int number,String initials) {
		// TODO Auto-generated method stub
		System.out.println(number+" "+initials +name+" is walking");
	}
}
