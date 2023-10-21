/*
 * WAP to print the followingg pattern
 * Take row input from the user
 *
 * a
 * A B
 * a b c
 * A B C D
 *
 */

import java.util.*;
class Demo{
	static void pattern(int row){
		for(int i = 1;i<=row;i++){
			char s = 'a';
			char b = 'A';
			for(int j = 1;j<=i;j++){
				if(i%2==1){
					System.out.print(s + " ");
					s++;
				}
				else{
					System.out.print(b +" ");
					b++;
				}
			}
			System.out.println();
		}

	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		pattern(row);
	}
}

