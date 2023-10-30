//WAP to check wheather a given number is armstrong number or not
//
//
//my best app
import java.util.*;

class Demo{
	static int x = 0;
	int armstrong(int num){
		if(num ==0)
			return 0;
		return pow(num%10,x) + armstrong(num/10);
	}
	int pow(int num,int x){
		if(x == 0)
			return 1;
		return num*pow(num,--x);
	}
	int numlen(int num){
		int temp = num;
		int count = 0;
		while(temp>0){
			count++;
			temp/=10;
		}
		return count;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		x = new Demo().numlen(num);
		if(new Demo().armstrong(num) == num)
			System.out.println(num + " is a armstrong number ");
		else
			System.out.println(num + "  is not a armstrong number");
	}
}
