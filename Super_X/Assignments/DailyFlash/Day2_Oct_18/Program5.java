/*
 * WAP to check wheather a string comtain vowels and return the count of vowels
 *
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();

                System.out.println(count(str));
        }
        /*
         * TC : O(N)
         * SC : O(1)
         */
	static int count(String str){
		int c = 0;
		for(int i =0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U')
				c++;
		}
		return c;
	}
}
