package point;

public class Point3D extends Point2D {
	private float z = 0.0f;
	
	public Point3D() {
		super();
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) {
		setXY(x, y);
		setZ(z);
	}
	
	public float[] getXYZ() {
		float[] xyz = {getX(), getY(), getZ()};
		return xyz;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() + ")";
	}
}
