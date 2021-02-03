package javaObjects;

public class Airplane {
	private String registration;
	private String from;
	private String to;
	private int departDay;
	private int departMonth;
	private double speed;
	
	public Airplane(String registration, String from, String to, int departMonth, int departDay, double speed) {
		this.registration = registration;
		this.from = from;
		this.to = to;
		this.departDay = departDay;
		this.departMonth = departMonth;
		this.speed = speed;
	}
	
	public void printInfo() {
		System.out.println("The airplane " + registration + " will travel from " + from + " to " + to + " at " + departMonth + "/" + departDay + ".");
	}
	
	public void planeSpeed() {
		System.out.println("Airplane: " + registration + "  -  Speed: " + speed);
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDepartDay() {
		return departDay;
	}

	public void setDepartDay(int departDay) {
		this.departDay = departDay;
	}

	public int getDepartMonth() {
		return departMonth;
	}

	public void setDepartMonth(int departMonth) {
		this.departMonth = departMonth;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}