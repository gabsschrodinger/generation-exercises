package javaPolymorphism;

public class Dog extends Animal {
	public Dog() {
		
	}
	
	@Override
	public String getAction() {
		return super.getName() + " runs.";
	}
	
	@Override
	public String getSound() {
		return "Woof woof";
	}
}
