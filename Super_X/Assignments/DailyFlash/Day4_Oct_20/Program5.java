/*
 * WAP to toggle the String to uppercase or lowercase
 * input Java
 * output jAVA
 *
 * input data
 * output DATA
 *
 */

import java.util.*;
class Demo{
	static String toggle(String str){
		StringBuffer sb = new StringBuffer("");
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				sb.append((char)(str.charAt(i)-32));
			}
			else
				sb.append((char)(str.charAt(i)+32));

		}
		return String.valueOf(sb);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(toggle(str));
	}
}

