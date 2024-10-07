package main;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {

			
		Scanner scanner = new Scanner(System.in);
		
		int[] x = new int[2];
		int[] y = new int[2];
 		
		System.out.println("x1,x2)");
		for( int i = 0 ; i < 2 ; i++ ) {
			x[i] = scanner.nextInt(); // scan x 
		}
		System.out.println("y1,y2)");
		for( int i = 0 ; i < 2 ; i++ ) {
			y[i] = scanner.nextInt(); // scan y
		}
		
		double sumx = Math.pow(x[0]-x[1],2); // (x1-x2)^2
		double sumy = Math.pow(y[0]-y[1],2); // (y1-y2)^2
		
		double sum = sumx + sumy; // (x1-x2)^2 + (y1-y2)^2
		
		
		double d = Math.pow(sum,0.5); // √(x1-x2)^2 + (y1-y2)^2
		
		System.out.print("d="+d); // print d
		
		scanner.close();
	}

}
