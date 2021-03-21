package demo;
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeArea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		Scanner input = new Scanner(System.in);
//		Step 1:Read in radius
		System.out.println("Enter a number for radius:");
		radius = input.nextInt();//radius is scan in keyboard
//		Step 2:Compute area
		area = radius * radius * 3.14159;
//		Step 3:Display the area
		System.out.println("The area for circle of radius" + radius + " is " + area);

	}

}
