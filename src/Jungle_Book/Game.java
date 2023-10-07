package Jungle_Book;

public class Game {
	public static void main(String args[]) {
		Bear b = new Bear();
		b.name = "Baloo";
		b.growl();
		b.Honeydrink();
		b.eat();
		b.walk();
		b.sleep();		
		System.out.println();		
		Human h = new Human();
		h.name = "Mowgli";
		h.drink();
		h.walk();
		h.eat();
		h.sleep();
		h.talk();
		h.think();		
		System.out.println();		
		Tiger t = new Tiger();
		t.name = "Shere Khan";
		t.roar();
		t.drink();
		t.eat();
		t.walk();
		t.sleep();
		t.hunt();
		
		System.out.println();
		
		Snake s = new Snake();
		s.name = "Kaa";
		s.drink();
		s.slide();
		s.eat();
		s.sleep();
		s.bite();		
		System.out.println();		
		Wolf w = new Wolf();
		w.name = "Raksha";
		w.eat();
		w.drink();
		w.walk();
		w.sleep();
		w.hunt();
		w.Bark();
	}
}
