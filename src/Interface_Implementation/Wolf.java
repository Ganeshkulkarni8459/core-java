package Interface_Implementation;

public class Wolf extends Animal implements IAnimal {
	String color;
	String weight;
	String name;
	
	public void Bark() {
		System.out.println(name+" is Barking");
	}
	public void Eat() {
		System.out.println(name+" is eating");
	}
	public void Drink() {
		System.out.println(name+" is drinking");
	}
	public void Hunt() {
		System.out.println(name+" is Hunting");
	}
	public void sleep() {
		System.out.println(name+" is sleeping");
	}
	

}
