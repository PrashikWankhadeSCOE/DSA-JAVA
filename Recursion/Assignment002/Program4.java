// Write a program to print the sum of odd number up to given number 
//
import java.util.*;

class Demo{
	
	int sumOfOdd(int n){
		if(n==0)
			return 0;
		if(n%2==0)
			sumOfOdd(--n);
		
		return n+sumOfOdd(--n);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(new Demo().sumOfOdd(n));
	}
}
