/*
 * WAP to check wheather a given no is odd or even
 *
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                System.out.println(evenOdd(n));
        }
        static String evenOdd(int n){
		if(n%2 == 0)
			return "Even";
		else
			return "odd";
        }
}
