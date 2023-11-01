// Write a program to determine whether a given positive integer is a sad number or
// not
//

import java.util.*;

class Demo{
	boolean sadnum(int num){
		if(num == 1){
			return true;
		}
		int sum = 0;
		while(num>0){
			sum += (num%10)*(num%10);
			num/=10;
		}
		return sadnum(sum);
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try{
			System.out.println(new Demo().sadnum(n));
		}catch(StackOverflowError ie){
			System.out.println(false);
		}
	}
}

