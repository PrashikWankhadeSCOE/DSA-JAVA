//WAP to check wheather a given number is abundant number or not 
//An abundant number is the sum of all its proper divisor is greater than the number value

import java.util.*;

class Demo{
	int x = 0;

	int abundant(int num){
		x++;
		if(num==x)
			return 0;
		if(num%x == 0)
			return x + abundant(num);
		return abundant(num);
	}
		
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		if(new Demo().abundant(num)>num)
			System.out.println(num + " is a abundant number");
		else 
			System.out.println(num + " is not an abundant number ");

	}
}
