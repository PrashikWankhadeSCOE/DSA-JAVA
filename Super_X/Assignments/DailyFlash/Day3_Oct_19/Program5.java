/*
 * WAP to check whether the string character other than letters
 *
 */

import java.util.*;

class Demo{
	static boolean check(String str){
		for(int i =0;i<str.length();i++){
			char ch = str.charAt(i);
	
			if((ch >= 'A' && ch<='Z')||(ch>='a' && ch<='z')){
				
			}
			else 
				return false;
		}
		return true;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean a = (check(str));
		if(a){
			System.out.println(str + " dont contain any other character except alphabets");
		}
		else
			System.out.println(str+ " contains other elements");
	}
}
