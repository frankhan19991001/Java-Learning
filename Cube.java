package mainpac;

public class Cube {
	private double side;
	private double area;
	private double volume;
	private double perimeter;
	
	public Cube(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double find_area() {
		return this.area = this.side * this.side * 6;
	}
	
	public double find_perimeter() {
		return this.perimeter = 4 * this.side;
	}
	
	public double find_area_oneside() {
		return this.side * this.side;
	}
	
	public double find_volume() {
		return this.volume = find_area_oneside() * this.side;
	}
	
	public void print_report() {
		this.area = find_area();
		this.perimeter = find_perimeter();
		this.volume = find_volume();
		System.out.println("Side: " + getSide());
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
		System.out.println("Volume: " + getVolume());
		
	}
}
	
