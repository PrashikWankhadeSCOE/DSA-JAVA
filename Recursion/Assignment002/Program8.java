//WAP to check wheather a given number is a perfect number or not 
//perfect number is a number whose sum of divisor is equal to the number wxcept itself 
//
//Best app of me till now


import java.util.*;

class Demo{
	int x = 0;
	
	int perfect(int num){
		x++;
		if(num == x)
			return 0;
		if(num%x == 0)
			return x + perfect(num);
		return perfect(num);
	}

	public static void main(String [] ags){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if(new Demo().perfect(num) == num )
			System.out.println(num+" is the perfect number ");
		else 
			System.out.println(num + " is not the perfect number ");
	}
}
