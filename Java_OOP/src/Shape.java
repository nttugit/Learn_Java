
public abstract class Shape {
	protected Point point;

	public Shape(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	public abstract double calculateArea();
}
