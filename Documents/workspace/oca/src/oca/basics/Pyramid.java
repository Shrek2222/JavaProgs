package oca.basics;

public class Pyramid {
	public static void main(String[] args) { 
		int Rightside = 0,
			 EndSpace = 7;		
		for (int row = 1; row <= 128; row += row) {
			
			for (int startSpace = 0; startSpace < EndSpace; startSpace++) {
				System.out.println("    ");
			}
			
			for (int l = 1; l <= row; l += l) {
				System.out.printf("%4d", (l));
			}
			
			for (int r = Rightside; r > 0 ; r /= 2 ) {
				System.out.printf("%4d", (r));	
			}
			System.out.println();	
			EndSpace--; 				
			Rightside = row;			
		}
	}
}
