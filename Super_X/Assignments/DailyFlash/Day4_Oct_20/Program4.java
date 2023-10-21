/*
 * WAP to print the sum of digits in a given range
 * input 1 to 10
 * input 21 to 30
 */

import java.util.*;
class Demo{
	static int suminrange(int s,int e){
		int sum = 0;
		while(s<e){
		
			sum = sum+s+e;
			s++;
			e--;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(suminrange(s,e));
	}
}

