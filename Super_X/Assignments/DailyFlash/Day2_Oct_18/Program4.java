/*
 * WAP tp print a composite numbers in a given range 
 * start 1
 * end 100
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int s = sc.nextInt();
		int e = sc.nextInt();

                composites(s,e);
        }
        /*
         * Double For
         * TC : O(N^2)
         * SC : O(1)
    	 */
	static void composites(int s,int e){
		for(int i=s;i<=e;i++){
			int c = 0;
			for(int j = 1;j<i;j++){
				if(i%j==0){
					c++;
				}
				if(c>1){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
