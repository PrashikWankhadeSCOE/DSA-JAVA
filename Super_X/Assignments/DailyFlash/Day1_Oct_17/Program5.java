/*
 * WAP to count the size of given string 
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                String n = sc.next();

                System.out.println(size(n));
        }
	static int size(String str){
		int count = 0;
		for(int i = 0;i<str.length();i++){
			count++;
		}
		return count;
	}
}


