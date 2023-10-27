//WAP to check whether the given number is palindrome or not 
//


import java.util.*;
class Demo{
	static int rev = 0;
	void palindrome(int n){
		if(n==0)
			return;
		int rem = n%10;
		rev = rev*10 + rem;
		palindrome(n/10);
	}
	void checkPalindrome(int n){
		int temp = n;
		int rev = 0;
		while(temp>0){
			int rem = temp%10;
			rev = rev*10 +rem;
			temp = temp/10;
		}
		if(rev == n)
			System.out.println("its a palindrome number");
		else
			System.out.println("Its not palindrome number");
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		new Demo().checkPalindrome(n);
		new Demo().palindrome(n);
		if(n == rev){
			System.out.println("Its a palindrome by recursion");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
