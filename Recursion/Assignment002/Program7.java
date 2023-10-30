//WAP to check wheather a given number is magic number or not 
//magic number is a number in which the eventual sum of the digits is equal to 1
//Not done


import java.util.*;

class Demo{
	int magic(int num ){
		if(num == 0 || num == 1)
			return 0;
		return num%10 + magic(num/10);
	}
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().magic(n));
		
		if(new Demo().magic(n)>9){
			if(new Demo().magic(new Demo().magic(n))==1)
				System.out.println("magic");
			else
				System.out.println("not a magic number");
		}
		else
			System.out.println("Not magic number");
	}
}
