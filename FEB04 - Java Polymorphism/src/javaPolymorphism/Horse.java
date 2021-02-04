package javaPolymorphism;

public class Horse extends Animal {
	public Horse() {
		
	}
	
	@Override
	public String getAction() {
		return super.getName() + " runs.";
	}
	
	@Override
	public String getSound() {
		return "Neigh!";
	}
}
