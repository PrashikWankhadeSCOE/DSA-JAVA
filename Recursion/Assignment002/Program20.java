// Write a program to determine whether a given positive integer is a Deficient
// Number or not. A Deficient Number is a positive integer where the sum of its
// proper divisors is less than the number itself.
//
//
import java.util.*;

class Demo{
	int def(int num,int div){
		if(div==num)
			return 0;
		if(num%div == 0){
			return div + def(num,++div);
		}
		return def(num,++div);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int ret = new Demo().def(n,1);

		if(ret>n)
			System.out.println("abundant number ");
		else if (ret == n)
			System.out.println("Perfect number ");
		else 
			System.out.println("deficient number");
	}
}
