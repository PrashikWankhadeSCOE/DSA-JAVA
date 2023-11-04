/*
 * WAP to print the following pattern
 * take input from user
 * row : 5
 * 1       2       3       4
 * a       b       c       d
 * 5       6       7       8
 * e       f       g       h
 * 9       10      11      12
 */

import java.util.*;

class Demo{
	void pattern(int row){
		int x = 1;
		char ch = 'a';
		for(int i = 1;i<=row;i++){
			for(int j = 1;j<row;j++){
				if(i%2!=0)
					System.out.print(x++ + "\t");
				else
					System.out.print(ch++ + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		new Demo().pattern(row);
	}
}
