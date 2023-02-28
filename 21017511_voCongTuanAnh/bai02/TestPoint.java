package bai02;

public class TestPoint {
  public static void main(String[] args) {
	Point a1 = new Point();
	Point a2 = new Point(10, 3);
	
	
	System.out.println("toa do a1 = "+a1);
	System.out.println("toa do a2 = "+a2);
	
	System.out.println("to do doi xung qua O a1 = "+ a1.negate());
	System.out.println("to do doi xung qua O a2 = "+ a2.negate());
    System.out.println("\nDistance a2  = "+a2.getDistance());
}
}
