package shape;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return width;
	}
	
	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}
	
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	
	@Override
	public void setLength(double side) {
		setSide(side);
	}

	@Override
	public String toString() {
		return "Square[width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}

}
