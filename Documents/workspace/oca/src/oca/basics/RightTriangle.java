package oca.basics;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 	

		
		System.out.print("Enter coordinates for testing ");
		double x = in.nextDouble();
		double y = in.nextDouble();

		 

		
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

		
		System.out.println("The point " + ((x > intersectx || y > intersecty)
			? "is not " : "is " ) + "in the triangle");
	}
}