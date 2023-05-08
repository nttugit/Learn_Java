
public class Main {
	public static void main(String[] args) {
////		Single inheritance Student -> Person
//		Person person1 = new Person("Tuan Tu", 2000);
//		Student student1 = new Student("Tuan Tu",2000,"22HCB","HCMUS");
//		System.out.println("Name: " + student1.getFullName());
//		person1.eat();
//		student1.sleep();
//		student1.doHomeWork();
		
//		// Single inheritance: Dog -> Animal
//		Dog lulu = new Dog();
//		lulu.eat();
//		lulu.bark();
		
//		// Multilevel inheritance: HuskyDog -> Dog -> Animal
//		HuskyDog risky = new HuskyDog();
//		risky.eat();
//		risky.bark();
//		risky.smoke();
		
		// Hierarchical inheritance: Dog -> Animal, Cat -> Animal, Bird -> Animal
//		Dog bobby = new Dog();
//		bobby.eat();
//		bobby.bark();
//		
//		Cat lucy = new Cat();
//		lucy.eat();
//		lucy.meow();
//		
//		Bird kiwi = new Bird();
//		kiwi.eat();
//		kiwi.fly();
		
		// Da ke thua (java ko support) => dung interface
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		
		Bird b = new Bird();
		b.eat();
		b.makeSound();
		
		Cat c  = new Cat();
		c.eat();
		c.makeSound();
		
	}
}
