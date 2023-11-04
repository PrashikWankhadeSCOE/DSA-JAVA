/*
 * WAP to check whether a given number is Duck number or not
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = num;
		int itr = 0;
		while(temp>0){
			int rem = temp%10;
			if(rem == 0){
				//System.out.println("its a duck number ");
				itr++;
				break;
			}
			temp = temp/10;
		}
		if(itr>0)
			System.out.println("its a duck number ");
		else
			System.out.println("its not a duck number ");

	}
}
