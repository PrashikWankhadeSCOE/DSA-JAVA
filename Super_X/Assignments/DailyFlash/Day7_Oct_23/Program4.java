/*
 * WAP to print a perfect number in a given range 
 * input 1 to 50
 * input 40 to 100
 */

import java.util.*;

class Demo{
	List perfect(int start,int end){
		List per = new ArrayList();
		for(int i = start;i<=end;i++){
			int sum = 0;
			for(int j = 1;j<i;j++){
				if(i%j == 0)
					sum += j;
			}
			if (sum == i)
				per.add(i);
		}
		return per;

	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println(new Demo().perfect(start,end));
	}
}
