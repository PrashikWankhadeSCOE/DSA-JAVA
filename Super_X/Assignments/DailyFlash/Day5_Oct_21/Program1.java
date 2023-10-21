/*
 * WAP to print the factorial of the digit in a given range
 * input 1-10
 */

import java.util.*;
class Demo{
	static void factinrange(int s,int e){
		for(int i = s;i<=e;i++){
			int fact = 1;
			int temp = i;
			while(temp>0){
				fact= fact*temp;
				temp--;
			}
			System.out.println(fact);
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		factinrange(s,e);
	}
}

