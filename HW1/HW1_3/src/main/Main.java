package main;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		double k = 10000;
		
		double temp = 1.0;
		double sum = 1.0;

		for( int i = 0 ; i < 10 ; i++ ) { // i < 10 == 10 += 10000++

			for( int j = 1 ; j <= k ; j++ ) { // j = 1 , j <= k == j <= 10000++
				temp *= j; // temp == j!
				sum += 1.0 / temp ; // sum = sum + 1/k!
			}
			System.out.println(sum);
			k += 10000; // 10000++
			
		}
		
	}

}
