/*
 * WAP to find the last occurance of the target in str
 * input -> str : onomatopoeia
 * 	    target : o
 */

import java.util.*;

class Demo{
	int lastOcc(String str,int target){
		for(int i = str.length()-1;i>=0;i--){
			if(target == str.charAt(i))
				return i;
		}
		return -1;
	}
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char target = sc.nextLine().charAt(0);
		System.out.println(new Demo().lastOcc(str,target));
	}
}
