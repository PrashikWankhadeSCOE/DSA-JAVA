/*
 * WAP to print the following pattern 
 * take input from user
 * 
 * 1 3 5 7
 * 2 4 6 8
 * 9 11 13 15
 * 10 12 14 16
 *
 */
import java.util.*;

class Demo{
	static void pattern(int row){
		int a = 1;
		int b = 2;
		for(int i = 1;i<=row;i++){
			for(int j =1;j<=row;j++){
				if(i%2==1){
					System.out.print(a + " ");
					a+=2;
				}
				else{
					System.out.print(b + " ");
					b+=2;
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

