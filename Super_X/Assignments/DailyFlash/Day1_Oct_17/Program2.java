/*
 * Que 2: 
 *
 */

import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);

                int row = sc.nextInt();

                printPattern(row);
        }
        static void printPattern(int row){
                int x = 1;
		for(int i = 1;i<=row;i++){
                        //int x = 1;
                        for(int j= 1;j<=i;j++){
                                System.out.print(x++ +" " );
                        }
			x--;
                        System.out.println();
                }
        }
}
