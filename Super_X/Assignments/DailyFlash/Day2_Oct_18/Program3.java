/*
 * WAP to check wheather a given number is prime or composite 
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                System.out.println(check(n));
        }
        /*
         * TC : O(N)
         * SC : O(1)
         */
	static String check(int n ){
		int c = 0;
		for(int i = 1;i<n;i++){
			if(n%i == 0){
				c++;
			}
			if(c>1)
				return "composite";
		}
		return "Prime";
	}
}

