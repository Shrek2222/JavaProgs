package oca.basics;

public class ApproxPI {
	public static void main(String[] args) {
		
		double sum = 0;
		double value = 10000.0;
		for (double r = 1; r <= (2 * value - 1); r += 2) {
			sum += 1 / r;
			r += 2;
			sum -= 1 / r; 
		}
		double pi = 4 * sum;

		
		System.out.println("PI value for  10000: " + pi);

		
		sum = 0;
		value = 20000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		
		System.out.println("PI value for 20000: " + pi);

		
		sum = 0;
		value = 100000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		
		System.out.println("PI value for  100000: " + pi);
	}
}