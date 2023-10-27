// WAP to find the factorial of number
//
import java.util.*;

class Demo{
	int fact(int n){
		if(n==1)
			return 1;
		return n*fact(--n);
	}
	int factorial(int i){
		int temp = i;
		int fact = 1;
		while(temp>0){
			fact = fact* temp;
			temp--;
		}
		return fact;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().fact(n));
		System.out.println(new Demo().factorial(n));
	}
}
