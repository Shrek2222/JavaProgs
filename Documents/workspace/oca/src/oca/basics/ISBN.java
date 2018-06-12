package oca.basics;
import java.util.Scanner;
public class ISBN {
public static void main (String [] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Enter ISBN number");
	int isbn = in.nextInt();
	int d9 = isbn % 10;
    int currentlength = isbn / 10;
    int d8 = currentlength % 10;
    currentlength = currentlength / 10;
    int d7 = currentlength % 10;
    currentlength = currentlength / 10;
    int d6 = currentlength % 10;
    currentlength = currentlength / 10;
    int d5 = currentlength % 10;
    currentlength = currentlength / 10;
    int d4 = currentlength % 10;
    currentlength = currentlength / 10;
    int d3 = currentlength % 10;
    currentlength = currentlength / 10;
    int d2 = currentlength % 10;
    currentlength = currentlength / 10;
    int d1 = currentlength % 10;
    currentlength = currentlength / 10;
    int checksum = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9) % 11;
    if (checksum == 10) {
    	System.out.println("The 10-ISBN number is "+isbn+"X");
    }
    else {
    	System.out.println("The 10-ISBN number is "+isbn+checksum);
    }
}
}
