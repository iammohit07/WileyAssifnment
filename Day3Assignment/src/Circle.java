
public class Circle {

	private double radius;
	private double area;

	public Circle() {
		this.radius = 5.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = Math.PI * (radius * radius);
		System.out.printf("The area of circle is : %.6f.\n", area);
	}
}