
public class Person {
	private String fullName;
	private int yob;
	
	public Person(String fullName, int yob) {
		super();
		this.fullName = fullName;
		this.yob = yob;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	
	public void eat() {
		System.out.println("mam am");
	}
	
	public void drink() {
		System.out.println("uc uc");
	}
	
	public void sleep() {
		System.out.println("zzzzz");
	}
}
