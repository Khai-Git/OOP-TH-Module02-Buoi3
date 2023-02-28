package bai03;

public class Cylinder {
    private float radius;
    private float height;
    
	public Cylinder() {
		this(0,0);
	}

	public Cylinder(float radius, float height) {
		setRadius(radius);
		setHeight(height);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		if(radius > 0)
		{
			this.radius = radius;
		}
		else
		{
			this.radius = 0;
		}
		
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if(height > 0)
		{
			
			this.height = height;
		}
		else
		{
			this.height = 0;
		}
	}
	
	public float tinhDienTichXungQuanh() {
		return (float) ((float) 2 * Math.PI * radius * height);
	}
	
	public float tinhDienTichToanPhan() {
		return (float) (2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height);
	}
	public float tinhTheTich() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	public String toString() {
		return String.format("radius = " + this.radius +" , "+ "height = " + this.height);
	}
	
	
	
	
	
	
    
    
}
