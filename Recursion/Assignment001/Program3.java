//WAP to print the sum of n natural numbers 
//

import java.util.*;

class Demo{
	int sum(int n){
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum = sum+i;
		}
		return sum;
	}
	int sumR(int n){
		if(n==0)
			return 0;
		return n+sumR(--n);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().sum(n));
		System.out.println(new Demo().sumR(n));
	}
}	
