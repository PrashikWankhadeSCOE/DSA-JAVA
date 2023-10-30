// WAP to print a product of digit of given number 
//

import java.util.*;

class Demo{
	int sum(int num){
		if(num==0)
			return 0;
		return num%10 + sum(num/10);
	}
	int sumofDigit(int num){
		int sum = 0;
		while(num>0){
			int rem = num%10;
			sum = sum+rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println(new Demo().sum(x));
		System.out.println(new Demo().sumofDigit(x));

	}
}
