//WAP to print the followinfg pattern 
//
//
//5
///
/*
A       B       C       D
1       3       5       7
A       B       C       D
9       11      13      15
A       B       C       D
*/
import java.util.*;

class Demo{
	void pattern(int n){
		int a = 1;
		for(int i = 1;i<=n;i++){
			char ch = 'A';
			for(int j = 1;j<=n-1;j++){
				if(i%2==1){
					System.out.print(ch++ + "\t");
				}
				else{
					System.out.print(a + "\t");
					a=a+2;
				}
			}
			System.out.println();
		}
	}
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new Demo().pattern(x);
	}
}
