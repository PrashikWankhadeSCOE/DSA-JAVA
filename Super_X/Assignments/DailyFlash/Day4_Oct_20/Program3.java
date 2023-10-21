/*
 * WAP to find the factorial of a given number
 */

import java.util.*;

class Demo{
	static int factorial(int num){
		int fact = 1;
		int temp = num;
		while(temp>0){
			fact = fact*temp;
			temp--;
		}
		return fact;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(factorial(num));
	}
}

