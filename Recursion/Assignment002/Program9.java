// WAP to check wheather the given number is a happy number or not 
//
// happy number is a number which eventually reaches 1 when replaced by a sum of the square of each digit
//

import java.util.*;
class Demo{
	boolean isMagic(int num){
		if(num == 1)
			return true;
		int sum = 0;
		while(num>0){
			sum += (num%10)*(num%10);
			num/=10;
		}
		return isMagic(sum);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try{
			System.out.println(new Demo().isMagic(n));
		}catch(StackOverflowError ie){
			System.out.println("False");
		}
	}
}
