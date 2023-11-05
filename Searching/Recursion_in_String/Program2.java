/*
 * WAP to replace 'a' in a string with '1'
 */

import java.util.*;

class Demo{
	String replace(String str){
		if(str==null || str.length()<=1){
			if(str.charAt(0) == 'a')
				return "1";
			else
				return str;
		}
		if(str.charAt(0) == 'a')
			return "1" + replace(str.substring(1));
		else
			return str.charAt(0) + replace(str.substring(1));

	}
	public static void main(String [] arggs){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                System.out.println(new Demo().replace(str));
        }
}
