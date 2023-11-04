/*
 * WAP to print the following pattern 
 * Take row input from the user 
 *
 * 10 
 * 9	8
 * 7	6	5
 * 4	3	2	1
 *
 */

import java.util.*;

class Demo{
	void pattern(int row){
		int a = row*(row+1)/2;
		for(int i = 1;i<=row;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(a-- + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		new Demo().pattern(row);
	}
}

