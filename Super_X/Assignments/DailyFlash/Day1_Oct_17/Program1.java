/*
 * Que 1 WAP to print the following pattern
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		
		printPattern(row);
	}
	static void printPattern(int row){
		for(int i = 1;i<=row;i++){
			int x = i;
			for(int j= 1;j<=row;j++){
				System.out.print(x++ +" " );
			}
			System.out.println();
		}
	}
}
