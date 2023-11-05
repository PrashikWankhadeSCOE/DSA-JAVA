/*
 * WAP to convert all character in the array uppercase 
 */

import java.util.*;

class Demo{
        String replace(String str){
                if(str==null || str.length()<=1){
			if(str.charAt(0)>='a' && str.charAt(0)<='z')
				return String.valueOf((char)(str.charAt(0)-32));
			else
				return str;
                }
		if(str.charAt(0)>='a' && str.charAt(0)<='z')
	 		return ((char)(str.charAt(0)-32)) + replace(str.substring(1));
		else
			return str.charAt(0) + replace(str.substring(1));
        }
        public static void main(String [] arggs){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                System.out.println(new Demo().replace(str));
        }
}
