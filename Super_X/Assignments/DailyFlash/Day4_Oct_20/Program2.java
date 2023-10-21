/*
 * WAP to print the following pattern
 * Take row input from user
 * 
 * A
 * B A
 * C B A
 * D C B A
 *
 */
import java.util.*;
class Demo{
	static void pattern(int row){
		for(int i = 1 ;i<=row;i++){
			char x = (char)('A'+i-1);
			for(int j = 1;j<=i;j++){
				System.out.print(x+ " ");
				x--;
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		//apattern2(row);
		pattern(row);
	}
}

