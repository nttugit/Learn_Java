
public class Car extends Vehicle {
	private String fuelType;
	
	public Car(VehicleProducer producer, String fuelType) {
		
		super("car", producer);
		this.fuelType = fuelType;
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 60;
	}

}
