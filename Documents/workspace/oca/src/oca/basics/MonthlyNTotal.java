package oca.basics;

import java.util.Scanner;

public class MonthlyNTotal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		System.out.print("Loan Amount: ");
		double loanAmount = in.nextDouble();
		System.out.println("Number of Years: ");
		int numberOfYears = in.nextInt();


		
		System.out.println(
			"Interest Rate    Monthly Payment    Total Payment");
		
		
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.println("%           ");
			double monthlyrate = i / 1200;
			double monthlyPayment = loanAmount * monthlyrate / (1
				- 1 / Math.pow(1 + monthlyrate, numberOfYears * 12));
			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears);
		}
	}
}
