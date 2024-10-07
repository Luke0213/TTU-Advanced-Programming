package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n , m;

		System.out.print("m:"); 
		m = scanner.nextInt(); // scan m array
		
		System.out.print("n:");
		n = scanner.nextInt(); // scan n array
		
		int[][] Array = new int[m][n];
		
		System.out.println("m,n:");
		
		for( int i = 0 ; i < m ; i++ ) {
			for( int j = 0 ; j < n ; j++ ) {
				Array[i][j] = scanner.nextInt(); // scan n , m
			}
		}
		
		for( int i = 0 ; i < m ; i++ ) {
			for( int j = 0 ; j < n ; j++ ) {
				System.out.print(Array[i][j]+" "); // print array
			}
		}
		
		System.out.println("\n");
		
		int[][] ArrayA = new int[n][m];
		
		for( int i = 0 ; i < n ; i++ ) {
			for( int j = 0 ; j < m ; j++ ) {
				ArrayA[i][j] = Array[j][i]; // 轉換n m 
			}
		}
		
		for( int i = 0 ; i < n ; i++ ) {
			for( int j = 0 ; j < m ; j++ ) {
				System.out.print(ArrayA[i][j]+" "); // print new array
			}
		}
		scanner.close();
	}
}
