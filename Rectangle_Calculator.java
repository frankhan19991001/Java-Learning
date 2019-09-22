package mainpac;

public class Rectangle_Calculator {
	private float width;
	private float length;
	private float rec_area;
	private float rec_perimeter;
	
	public Rectangle_Calculator(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getRec_area() {
		return rec_area;
	}

	public void setRec_area(float rec_area) {
		this.rec_area = rec_area;
	}

	public float getRec_perimeter() {
		return rec_perimeter;
	}

	public void setRec_perimeter(float rec_perimeter) {
		this.rec_perimeter = rec_perimeter;
	}

	public float find_area() {
		return this.rec_area = this.length * this.width;
	}
	
	public float find_perimeter() {
		return this.rec_perimeter = (this.length + this.width) * 2;
	}
	
	public float get_length_for_admin(int password) {
		if (password == 123) {
			return this.length;
		} else {
			return 0;
		}
	}
	
	public void print_rec_info() {
		this.rec_area = find_area();
		this.rec_perimeter = find_perimeter();
		System.out.println("The length of the rectangle is: " + this.length);
		System.out.println("The width of the rectangle is: " + this.width);
		System.out.println("The area is: " + this.rec_area);
		System.out.println("The perimeter is: " + this.rec_perimeter);
	}

}
















