package sys;

public class Q3Cylinder {
	
	Q3Circle c;
	double height;
	
	public Q3Cylinder(Q3Circle radius, double height) {
		c = radius;
		//반지름
		this.height = height;
		//높이값
		
	}
	
	public double getVolume() {
		return c.getArea() * height;
	}

	public static void main(String[] args) {
		
		Q3Cylinder cy = new Q3Cylinder(new Q3Circle(2.8), 5.6);
		System.out.println("원통의부피 : " + cy.getVolume());

	}

}
