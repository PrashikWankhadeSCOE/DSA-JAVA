// WAP to count the occurance of specific digit in a given number 
//

import java.util.*;

class Demo{
	static int a = 0;
	
	//Recursion
	
	void oc(int n,int x){
		if(n==0)
			return ;
		int rem = n%10;
		if(rem==x)
			a++;
		oc(n/10,x);
	}
	
	//for loop
	
	int occ(int n, int x){
		int count = 0;
		int temp= n;
		while(temp>0){
			int rem = temp%10;
			if(rem == x)
				count++;
			temp/=10;
		}
		return count;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		System.out.println(new Demo().occ(n,x));
		new Demo().oc(n,x);
		System.out.println(a);
	}
}
