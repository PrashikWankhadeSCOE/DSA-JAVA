/*
 * WAP to check wheather the given number is a strong number or not
 *
 * Number whose sum of the factorial of digit is equal to the number 
 */

import java.util.*;
class Demo{
	static boolean strong(int num){
		int temp = num;
		int ret = 0;
		while(temp>0){
			int x = temp%10;
			int fact = 1;
			while(x>0){
				fact *=x;
				x--;
			}
			ret+=fact;
			temp/=10;
		}
		if(ret == num)
			return true;
		return false;

	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean a = strong(num);

		if(a){
			System.out.println(num+ "  is a strong number");
		}
		else
			System.out.println(num + " is not a strong number");
	}
}



