//Write a program that determines whether a given number is a cube number or not.
//(A cube number is defined as a number that is the cube of an integer).
//

import java.util.*;

class Demo{
	int i = 0;
	boolean iscubic(int num){
		i++;
		if(i*i*i>num)
			return false;
		if(i*i*i==num)
			return true;
		return iscubic(num);
	}
	boolean cubic(int num){
		for(int i = 0;i*i*i <= num+1;i++){
			if(i*i*i == num)
				return true ;
		}
		return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().cubic(n));
		System.out.println(new Demo().iscubic(n));
	}
}
