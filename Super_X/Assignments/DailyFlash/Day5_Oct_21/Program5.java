/*
 * WAP to print the occurance of the letter in given string 
 * input : "Knnow the code till the core"
 * alphabet : o
 * Output : 3
 */

import java.util.*;

class Demo{
	static int occ(String str,char ch){
		for(int i = 0;i<str.length();i++){
			if((str.charAt(i))==(ch))
				return i+1;
		}
		return -1;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println(occ(str,ch));
	}
}

