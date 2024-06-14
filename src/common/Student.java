package common;

public class Student extends Person {
	private String stNumber;
	
	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	
	@Override
	public String toString() {
		return super.toString()	+ ", 학번: " + stNumber;
	}
}
