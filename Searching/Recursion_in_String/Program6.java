// Compare two string if the same return true else false
//
/*
 * WAP to convert all character in the array uppercase
 */

import java.util.*;

class Demo{
	String checkr(String str1,String str2,int x){

		if(str1.charAt(x) != str2.charAt(x) || str1.length()!=str2.length())
			return "Not equal string";
		if(x>=str1.length()-1)
			return "Equal strings";
		
		return checkr(str1,str2,++x);
	}
	// For loop
	// TC : O(N)
	// SC : O(N)
        String check(String str1,String str2){
		if(str1.length() != str2.length())
			return "Not equal";
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();

		for(int i = 0;i<ch1.length;i++){
			if(ch1[i] != ch2[i])
				return "Not equal";
		}
		return "Equal strings";
        }
        public static void main(String [] arggs){
                Scanner sc = new Scanner(System.in);
                String str1 = sc.nextLine();
		String str2 = sc.nextLine();
                System.out.println(new Demo().check(str1,str2));
		System.out.println(new Demo().checkr(str1,str2,0));
        }
}
