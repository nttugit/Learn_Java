
public abstract class Vehicle {
	protected String type;
	protected VehicleProducer producer;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public VehicleProducer getProducer() {
		return producer;
	}

	public void setProducer(VehicleProducer producer) {
		this.producer = producer;
	}

	public Vehicle(String type, VehicleProducer producer) {
		super();
		this.type = type;
		this.producer = producer;
	}

	public String getProducerName() {
		return this.producer.getName();
	}

	public void start() {
		System.out.println("Start");
	}

	public void accelerate() {
		System.out.println("Accelerate");
	}

	public void stop() {
		System.out.println("Stop");
	}

	public abstract double getSpeed();
}
