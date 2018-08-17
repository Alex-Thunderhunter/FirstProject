// Alexander Goodnow 
// CST-105
// August 16, 2018
// This is my own work.

//Scanner Utility
import java.util.Scanner;

public class Introduction {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Input:
		System.out.print("Enter a number for radius: ");
		
		//Radius
		double radius = input.nextDouble();
		
		//Area		
		double area = radius * radius * 3.14159;
		
		//Output:		
		System.out.println("The area for the circle of radius " 
		+ radius + " is " + area);
		
		//Circumference 
		double circumference= 3.14159 * 2*radius; 
		
		//Output2:		
		System.out.println("The circumference of the circle is: " +
		circumference);
				
	}

}
