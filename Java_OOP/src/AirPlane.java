
public class AirPlane extends Vehicle {
	private String fuelType;

	public AirPlane(VehicleProducer producer, String fuelType) {
		super("airplane", producer);
		this.fuelType = fuelType;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void takeOff() {
		System.out.println("Take off");
	}

	public void landing() {
		System.out.println("Landing");
	}

}
