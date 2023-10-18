/*
 * WPA to print the odd number in a given range 
 *
 */

import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                int start = sc.nextInt();
		int end = sc.nextInt();

                even(start,end);
        }
	static void even(int start,int end){
		for(int i = start;i<=end;){
			if(i%2==1){
				System.out.print(i+ " ");
				i+=2;
			}
			else{
				i++;
			}
		}
	}
}

