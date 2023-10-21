/*
 * WAP to print the following patern
 *
 * 1
 * 2 1
 * 3 2 1 
 * 4 3 2 1
 *
 */

import java.util.*;
class Demo{
	static void pattern(int row){
		for(int i = 1;i<=row;i++){
			for(int j = i ;j>0;j--){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		pattern(row);
	}
}
