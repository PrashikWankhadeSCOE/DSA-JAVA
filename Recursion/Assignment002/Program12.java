//WAP to determine wheather a given number is a composite number or not
//

import java.util.*;

class Demo{
	int x = 0;
	static int count = 0;
	void composite(int num){
		x++;
		if(num <= x+1)
			return ;
		if(num%x == 0)
			count++;
		composite(num);
	}
	public static void main(String []a ){
		Scanner sc = new Scanner(System.in);

		int num= sc.nextInt();
		new Demo().composite(num);
		if(count > 1 )
			System.out.println(num+" is a composite number ");
		else 
			System.out.println(num + " is a prime number ");
	}
}
