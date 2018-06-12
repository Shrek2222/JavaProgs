package oca.basics;

import java.util.Scanner;

public class InCircle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		System.out.print("Enter two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();

		
		boolean within = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

		
		System.out.println("Point (" + x + ", "+ y + ") is " + 
			((within) ? "in " : "not in ") + "the circle"); 
	}
}