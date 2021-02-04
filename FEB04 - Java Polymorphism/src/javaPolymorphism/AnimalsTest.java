package javaPolymorphism;

public class AnimalsTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Dog");
		dog.setAge(5);
		
		Horse horse = new Horse();
		horse.setName("Horse");
		horse.setAge(10);
		
		Sloth sloth = new Sloth();
		sloth.setName("Sloth");
		sloth.setAge(2);
		
		System.out.println(sloth.getAction());
		System.out.println(sloth.getSound());
		System.out.println("\n");
		System.out.println(dog.getAction());
		System.out.println(dog.getSound());
		System.out.println("\n");
		System.out.println(horse.getAction());
		System.out.println(horse.getSound());
	}
}
