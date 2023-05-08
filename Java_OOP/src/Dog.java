
public class Dog extends Animal{

//	public Dog(String name) {
//		super(name);
//	}

	public Dog() {
		super("Dog");
	}
	
	
	@Override
	public void eat() {
		System.out.println("I love bone");
	}


	@Override
	public void makeSound() {
		System.out.println("woof woof");
	}
}
