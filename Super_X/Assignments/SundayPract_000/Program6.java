/*
 * WAP to find a number which has number on its lef is less than of or equal to itself 
 * input : 456975962
 * Output : 9
 */

import java.util.*;

class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println(lessThanEqual(x));
	}
	static int lessThanEqual(int x ){
		String str = String.valueOf(x);
		int arr[] = new int[str.length()];
		int temp = x;
		for(int i = 0;i<arr.length;i++){
			arr[i] = temp%10;
			temp = temp/10;
		}
		for(int i = 0;i<arr.length;i++){
			boolean c = true;
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]<arr[j])
					c = false;
			}

			if(c == true)
				return arr[i];
		}
		return 0;
	}
}

