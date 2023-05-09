
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
		
//		// Da ke thua (java ko support) => dung interface
//		Dog d = new Dog();
//		d.eat();
//		d.makeSound();
//		
//		Bird b = new Bird();
//		b.eat();
//		b.makeSound();
//		
//		Cat c  = new Cat();
//		c.eat();
//		c.makeSound();
		
//		// Overloading
//		MyMath myMath = new MyMath();
//		System.out.println(myMath.min(12, -3));
//		System.out.println(myMath.min(1.2321, 11));
//		System.out.println(myMath.sum(1.5,2.6));
////		double numberArr[]  = {1,1.5,12};
//		double numberArr[] = new double []{1,1.5,12};
//		System.out.println(myMath.sum(numberArr));
		
		
//		// Abstract class
//		Point recPoint = new Point(5,5);
//		Point circlePoint = new Point(15,9);
//		
//		// abstract class ko the tao instance
////		Shape s = new Shape(recPoint);
//		
//		Circle circle = new Circle(circlePoint,8);
//		Rectangle rectangle=  new Rectangle(recPoint, 3,4);
//		System.out.println(circle.calculateArea());
//		System.out.println(rectangle.calculateArea());
//		
		
//		Inheritance and abstract
		VehicleProducer bicycleProducer = new VehicleProducer("Martin", "Germany");
		VehicleProducer carProducer = new VehicleProducer("Toyota", "Japan");
		VehicleProducer airplaneProducer = new VehicleProducer("Boeing", "NATO");

		Vehicle myBicycle = new Bicycle(bicycleProducer);
		Vehicle myCar = new Car(carProducer,"gas");
		AirPlane myPlane = new AirPlane(airplaneProducer,"petrol");
		
		System.out.println("Bicycle: ");
		myBicycle.start();
		myBicycle.accelerate();
		myBicycle.stop();
		System.out.println("Speed: " + myBicycle.getSpeed());
		System.out.println("Producer: " + myBicycle.getProducerName());
		
		System.out.println("\nCar: ");
		myCar.start();
		myCar.accelerate();
		myCar.stop();
		System.out.println("Speed: " + myCar.getSpeed());
		System.out.println("Producer: " + myCar.getProducerName());
		
		System.out.println("\nAirplane: ");
		myPlane.start();
		myPlane.accelerate();
		myPlane.stop();
		myPlane.takeOff();
		myPlane.landing();
		System.out.println("Speed: " + myPlane.getSpeed());
		System.out.println("Producer: " + myPlane.getProducerName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
