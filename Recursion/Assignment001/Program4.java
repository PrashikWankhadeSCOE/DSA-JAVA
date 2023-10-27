//WAP to print the length of digits in a number 
//


import java.util.*;

class Demo{

	int lengthOfdigitR(int n){
		if(n==0)
			return 0;
		return 1+lengthOfdigitR(n/10);
	}
	int lengthOfdigit(int n){
		int count = 0;
		int temp = n;
		while(temp>0){
			count++;
			temp/=10;
		}
		return count;
	}
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().lengthOfdigit(n));

		System.out.println(new Demo().lengthOfdigitR(n));
	}
}
