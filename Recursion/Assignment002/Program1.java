// Write a program to print the factorial of a given number
//

import java.util.*;

class Demo{
	int fact(int n){
		if(n==1){
			return 1;
		}
		return n*fact(--n);
	}
	int factorial(int n ){
		int fact = 1;
		while(n>0){

			fact = fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(new Demo().fact(n));
		System.out.println(new Demo().factorial(n));
	}
}
