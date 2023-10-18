/*
 * WAP to print the following pattern 
 * 
 * A B C D
 * B C D E
 * C D E F 
 * D E F G
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		pattern(row);
	}
	/*
	 * Single For 
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static void pattern(int row){
		char ch = 'A';
		for(int i = 1;i<=row*row;i++){
			if(i%row !=0){
				System.out.print(ch + " ");
				ch++;
			}
			else{
				System.out.println(ch);
				ch++;
				ch= (char)(ch-row+1);
			}
		}
	}
}

