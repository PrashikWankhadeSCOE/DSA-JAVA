/*
 * WAP to take the string from the user and convert the all even indives of string to uppercase
 * and odd incices string to lowercase
 * Input : dfTbnSrOvryt
 * Output : DfTbNsRoVrYt 
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(upLow(str));
	}
	static String upLow(String str){
		StringBuffer sb = new StringBuffer("");
		for(int i = 0;i<str.length();i++){
			if(i%2==0 && str.charAt(i)>=97 && str.charAt(i)<=122)
				sb.append((char)(str.charAt(i)-32));
			else if(i%2==1 && str.charAt(i)>=65 && str.charAt(i)<=90)
				sb.append((char)(str.charAt(i)+32));
			else
				sb.append(str.charAt(i));
		}
		return new String(sb);
	}
}
