/*
 * WAP to print the following pattern 
 * Take input from user
 *
 * A B C D 
 * # # # #
 * A B C D
 * # # # #
 * A B C D
 *
 */

import java.util.*;

class Demo{
	static void pattern(int row){
		for(int i = 1;i<=row;i++){
			char x = 'A';
			for(int j = 1;j<=row;j++){
				if(i%2==1){
					System.out.print(x + " ");
					x++;
				}
				else{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
	static void pattern2(int row){
		int a = 1;
		char x = 'A';
		for(int i = 1;i<=row*row;i++){
			if(a%2==1){
				System.out.print(x+ " ");
				x++;
			}
			
			else
				System.out.print("# ");
			
			if(i%row==0){
				System.out.println();
				a++;
				x='A';
			}

		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		pattern(row);
		pattern2(row);
	}
}

