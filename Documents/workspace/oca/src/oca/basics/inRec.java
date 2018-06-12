package oca.basics;
import java.util.Scanner;

public class inRec {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		System.out.print("Enter a point: ");
		double x = in.nextDouble();
		double y = in.nextDouble();

		
		boolean within = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
										  (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

		
		System.out.println("Point (" + x + ", " + y + ") is " +
			((within) ? "in " : "not in ") + "the rectangle");
	}
}