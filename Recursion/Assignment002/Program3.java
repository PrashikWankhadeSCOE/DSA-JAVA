// WAP to print the maximum digit in a given number
//

import java.util.*;

class Demo{
	static int max = Integer.MIN_VALUE;
	void max(int x){
		if(x==0)
			return;
		if(max<x%10)
			max = x%10;
		max(x/10);
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new Demo().max(x);
		System.out.println(max);
	}
}
