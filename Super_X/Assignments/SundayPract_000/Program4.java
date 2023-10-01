/*
 * WAP to print the pattern 
 * A b C d E
 * e D c B
 * B c D
 * d C
 * C
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		pattern(x);
	}
	static void pattern(int x){
		char c = 'A';
		for(int i = 0;i<x;i++){
			for(int j = 0;j<x-i;j++){
				if((i+j)%2 == 0){
					System.out.print(c++ + " "); 	
				}
				else{
					System.out.print((char)(c++ + 32) + " ");
				}	
			}
			c--;
			System.out.println("");
		}	
	}
}


