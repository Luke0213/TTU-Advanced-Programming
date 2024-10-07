package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i , j ,  L , k ;
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for( L = 0 ; L < num ; L++ ) {
			
			for( k = 0 ; k < L ; k++ ) {
				System.out.print("  "); // 排版
			}
			
			for( i = 1 ; i <= num - L ; i++ ) { // num = 4 , i = 1 , i < 4 - L == 1 2 3 4 == 1 2 3 == 1 2 == 1
				System.out.print(i+" ");
			}
			
			for( j = num - 1 - L ; j > 0 ; j-- ) { // j = 4 - 1 - L , j > 0 == 3 2 1 == 2 1 == 1 
				System.out.print(j+" ");
			}
			System.out.print("\n"); // 排版
		}
		scanner.close();
	}
}
