package oca.basics;

import java.util.Scanner;

public class OverlapRec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	

		
		
		System.out.print("Enter r1's center (x,y), width and height: ");
		double smallx = in.nextDouble();
		double smally = in.nextDouble();
		double smallWidth = in.nextDouble();
		double smallHeight = in.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
		double bigx = in.nextDouble();
		double bigy = in.nextDouble();
		double bigWidth = in.nextDouble();
		double bigHeight = in.nextDouble();

		
		if	((Math.pow(Math.pow(bigy - bigy, 2), .05) + bigHeight / 2 <= bigHeight / 2) && 
			(Math.pow(Math.pow(bigx - smallx, 2), .05) + bigWidth / 2 <= smallWidth / 2) &&
			(smallHeight / 2 + bigHeight / 2 <= smallHeight) &&
			(smallWidth / 2 + bigWidth / 2 <= smallWidth))
			System.out.println("Smallrec is inside Bigrec");
		else if ((smallx + smallWidth / 2 > bigx - bigWidth) ||
					(smally + smallHeight / 2 > bigy - bigHeight))
			System.out.println("Smallrec overlaps Bigrec");
		else
			System.out.println("Small does not overlap Big");
	}
}
