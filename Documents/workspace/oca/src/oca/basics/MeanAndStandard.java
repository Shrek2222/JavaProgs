package oca.basics;
import java.util.Scanner;
public class MeanAndStandard {

    public static void main(String[] strings) {

        double total = 0.0;
        double squared = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        for (int i = 0; i < 10; i++) {
            double number = in.nextDouble();
            total += number;
            squared += Math.pow(number, 2.0);
        }
        double deviation = Math.pow((squared - total * total / 10.0) / 9.0, 0.5);
        double mean = total / 10.0;

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
    }
}
