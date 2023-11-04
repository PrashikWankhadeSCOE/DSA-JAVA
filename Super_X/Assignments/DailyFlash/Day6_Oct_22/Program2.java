//WAP to print the folllowing pattern 
//
/*
1 
7	26 
63	124	215
342	511	728	999
*/



import java.util.*;
class Demo{
	void pattern(int row){
		int a = 1;
		for(int i = 1;i<=row;i++){
			for(int j =1;j<=i;j++){
				System.out.print(a*a*a-1 +"\t");
				a++;
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		new Demo().pattern(row);
	}
}
