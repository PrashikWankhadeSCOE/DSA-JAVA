/*
 * WAP to printn the following pattern 
 * A B C D 
 * D C B A
 * A B C D
 * D C B A
 *
 */

import java.util.*;

class Demo{
	static void pattern(int row){
		char ch = 'A';
		for(int i = 1;i<=row;i++){
			for(int j = 1;j<=row ;j++){
				System.out.print(ch + "\t");
				if(i%2==1)
					ch++;
				else
					ch--;
			}
			System.out.println();
			if(i%2!=0)
				ch--;
			else
				ch++;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		pattern(row);
	}
}
