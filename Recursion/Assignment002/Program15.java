//WAP to check if a given number is a Duck number or not 
//A Duck number is a number which doesnt start with zero but has at least one digit as zero 
//

import java.util.*;

class Demo{
	boolean duck(int num){
		if(num == 0)
			return false;
		while(num>0){
			int rem = num%10;
			if(rem == 0)
				return true;
			num/=10;
		}
		return false;
	}
	//Recursion 
	
	boolean isduck(int num){
		if(num==0)
			return false;
		if(num%10==0)
			return true;
		return isduck(num/10);
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().duck(n));
		System.out.println(new Demo().isduck(n));
	}
}
