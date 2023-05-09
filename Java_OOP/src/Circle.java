
public class Circle extends Shape {
	private double radius;
	

	
	public Circle(Point point, double radius) {
		super(point);
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
}
