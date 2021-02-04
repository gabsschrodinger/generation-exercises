package javaPolymorphism;

public class Sloth extends Animal {
	public Sloth() {
		
	}
	
	@Override
	public String getAction() {
		return super.getName() + " climbs trees.";
	}
	
	@Override
	public String getSound() {
		return "aahh-eeeeeee";
	}
}
