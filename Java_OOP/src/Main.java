
public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Tuan Tu", 2000);
		Student student1 = new Student("Tuan Tu",2000,"22HCB","HCMUS");
		System.out.println("Name: " + student1.getFullName());
		person1.eat();
		student1.sleep();
		student1.doHomeWork();
	}
}
