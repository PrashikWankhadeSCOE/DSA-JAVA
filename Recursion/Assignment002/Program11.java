//WAP to check wheather a given number is a harshad number or not 
//Harshad number is a number that is duvisible by the sum of its digits


import java.util.*;
class Demo{
	int sum(int num){
		if(num == 0)
			return 0;
		return num%10 + sum(num/10);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%(new Demo().sum(num))==0)
			System.out.println("its a harshad number ");
		else
			System.out.println("Its not a harshad number");
	}
}
