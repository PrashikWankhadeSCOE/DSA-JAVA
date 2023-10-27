
//WAP to check whether a number is prime or not
//

import java.util.*;

class Demo{
	static int count = 0;
	int x = 1;
	void fun(int n){
		if(n==x)
			return;
		if(n%x==0)
			count++;
		x++;
		fun(n);
	}

	String prime(int n){
		int count = 0;
		for(int i = 1;i<=n;i++){
			if(n%i == 0){
				count++;
			}
		}
		if(count==2){
			return "its a prime number ";
		}
		return "its a composite number";
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(new Demo().prime(n));
		new Demo().fun(n);
		if(count == 1)
			System.out.println("its a prime number ");
		else
			System.out.println("its not a prime number ");
	}
}
