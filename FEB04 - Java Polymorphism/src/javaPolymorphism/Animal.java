package javaPolymorphism;

public abstract class Animal {
	private String name;
	private int age;
	private String sound;
	private String action;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSound() {
		return sound;
	}

	public String getAction() {
		return action;
	}

}
