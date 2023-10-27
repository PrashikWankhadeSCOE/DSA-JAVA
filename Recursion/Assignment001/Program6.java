// WAp to calculate the sum of digits of given positive integer
//

import java.util.*;

class Demo{
	
	int sumOfdigit(int n){
		if(n==0){
			return 0;
		}
		return n%10+sumOfdigit(n/10);
	}
	int sumofDigit(int n){
		int temp = n;
		int sum = 0;
		while(temp>0){
			int rem = temp%10;
			sum = rem+sum;
			temp/=10;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(new Demo().sumofDigit(n));
		System.out.println(new Demo().sumOfdigit(n));
	}
}
