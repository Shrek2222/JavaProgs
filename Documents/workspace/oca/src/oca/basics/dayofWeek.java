package oca.basics;
import java.util.Scanner;
public class dayofWeek {
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	System.out.println("What is today's day, if Sunday is 0 and Saturday is 6? ");
	int day = in.nextInt();
	System.out.println("How many days from now do you want to know about? ");
	int fut = in.nextInt();
	int date = (day + fut) % 7 ;
	
	switch (day) {
	
	case (0):
		System.out.println("Sunday");
	break;
	case (1):
		System.out.println("Monday");
	break;
	case (2):
		System.out.println("Tuesday");
	break;
	case (3):
		System.out.println("Wednesday");
	break;
	case (4):
		System.out.println("Thursday");
	break;
	case (5):
		System.out.println("Friday");
	break;
	case (6):
		System.out.println("Saturday");
	break;
}
	if (date == 0) {
		System.out.printf("Todays is %s and the future day is Sunday", day);
    }else if(date == 1){
    	System.out.printf("Todays is %s and the future day is Monday", day);
    }else if(date == 2){
    	System.out.printf("Todays is %s and the future day is Tuesday", day);
    }else if(date == 3){
    	System.out.printf("Todays is %s and the future day is Wednesday", day);
    }else if(date == 4){
    	System.out.printf("Todays is %s and the future day is Thursday", day);
    }else if(date == 5){
    	System.out.printf("Todays is %s and the future day is Friday", day);
    }else if(date == 6){
    	System.out.printf("Todays is %s and the future day is Saturday", day);
    }
}
}
