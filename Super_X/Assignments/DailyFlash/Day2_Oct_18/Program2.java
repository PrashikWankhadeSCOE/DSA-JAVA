/*
 * WAP to print the following Pattern
 *
 * 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 *
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();

                pattern(row);
        }
        /*
         * Single For
         * TC : O(N^2)
         * SC : O(1)
         */

	/*
	 * Double for 
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static void pattern(int row){
		for(int i = 1;i<=row;i++){
			int x = i;
			for(int j = 1;j<= i ;j++){
				System.out.print(x+ " ");
				x+=i;
			}
			System.out.println();
		}
	}
}
