//WAP to check wheather a given number is strong number or not
// stack overflow for 40585
//
//best app of me 

import java.util.*;

class Demo{
	int strong(int n){
		if(n==0)
			return 0;
		return fact(n%10) + strong(n/10);	
	}
	
	int fact(int n){
		if(n==1)
			return 1;
		return n*fact(--n);
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(new Demo().strong(n) == n)
			System.out.println("it's a strong number ");
		else 
			System.out.println("Not a strong number ");
	}
}
