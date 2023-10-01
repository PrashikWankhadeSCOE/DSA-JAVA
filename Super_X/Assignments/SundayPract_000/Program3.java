/*
 * Que 3 :
 * Print Following Pattern 
 * D C B A
 * e f g h 
 * F E D C
 * g h i j 
 */
import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		char x = sc.next().charAt(0);
		pattern(x);
	}
	static void pattern(char x){
		int len = x-64;
		
		for(int i = 0;i<len;i++){
			int c = x;
			for(int j = 0;j<len;j++){
				if(i%2==0){
					System.out.print((char)c+" ");
					c--;
				}
				if(i%2 == 1){
					System.out.print((char)(c+32) + " ");
					c++;
				}
			}
			System.out.println("");
			x++;
		}
	}
}

