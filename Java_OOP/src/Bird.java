
public class Bird extends Animal{

	public Bird() {
		super("Bird");
	}

	@Override
	public void eat() {
		System.out.println("I love worms");
	}

	@Override
	public void makeSound() {
		System.out.println("chip chip");
	}
}
