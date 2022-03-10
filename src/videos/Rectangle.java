package videos;

public class Rectangle {
	
	private double width;
	private double length;
	private double area;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width * length;
		
	}
		
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
		area = width * length;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
		area = width * length;
	}


	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}	

}
