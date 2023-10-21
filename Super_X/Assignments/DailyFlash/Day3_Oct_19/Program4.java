/*
 * WAP to print each reverse number in the given range
 * input start 25435
 * end 25449
 */

import java.util.*;

class Demo{
        static void reverse(int start,int end){
                for(int i = start;i<=end;i++){
			int temp = i;
                	int rev = 0;
        	        while(temp>0){
	                        int x = temp%10;
                        	rev = rev*10 + x;
                	        temp/=10;
        	        }
	                System.out.println(rev);
		}
        }
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();
		int end = sc.nextInt();

                reverse(start,end);
        }
}
