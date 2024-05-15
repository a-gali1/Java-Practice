
public class Rectangle {

	double width = 1.0;
	double height = 1.0;
	int numOfObjects = 0;
	Rectangle() { numOfObjects++; }
	Rectangle(double w, double h) { 
		width = w;
		height = h;
		numOfObjects++;
	}
	public double getWidth() { return width; }
	public double getHeight() { return height; }
	public void setWidth( double w) { width = w; }
	public void setHeight( double h) { height = h; }
	public double getArea() { return width*height; }
	public double getPerimeter() { return (width*2) + (height*2); }
	public String toString() { return "The Rectangle has a width of " + width + " and a height of " + height + "."; }

	
}
