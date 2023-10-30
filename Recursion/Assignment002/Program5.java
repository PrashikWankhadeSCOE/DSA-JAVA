//WAP to check wheather a given number is palindrome number or not 
//

import java.util.*;

class Demo{
	static int rev = 0;
	void palindrome(int n){
		if(n==0)
			return;
		
		rev=rev*10 + n%10;
		palindrome(n/10);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		new Demo().palindrome(x);
		if(rev == x)
			System.out.println("Palindrome number ");
		else 
			System.out.println("Not a palindrome number ");
	}
}
