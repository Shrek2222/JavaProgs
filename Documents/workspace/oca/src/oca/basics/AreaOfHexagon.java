package oca.basics;

import java.util.Scanner;

public class AreaOfHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the length of a side: ");
		double s = input.nextDouble();
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		
		System.out.printf("The are of the hexagon is %4.2f\n", area);
	}
}