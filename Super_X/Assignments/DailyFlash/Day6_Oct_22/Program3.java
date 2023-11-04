//WAP to check wheather a given number is perfect or not
//

import java.util.*;


class Demo{
	int def(int num,int div){
		if(div==num)
			return 0;
		if(num%div == 0){
			return div + def(num,++div);
		}
		return def(num,++div);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int ret = new Demo().def(n,1);

		if(ret>n)
			System.out.println("abundant number ");
		else if (ret == n)
			System.out.println("Perfect number ");
		else
			System.out.println("deficient number");
	}
}
