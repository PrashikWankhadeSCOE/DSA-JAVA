//WAP to determine wheather a given number is a square number or not
//
import java.util.*;
class Demo{
	boolean square(int n){
		for(int i = 0;i<=n;i++){
			if(i*i == n){
				return true;
			}
		}
		return false;
	}
	//recursion
	boolean checksqr(int num,int temp){
		if(temp*temp>num)
			return false;
		if(temp*temp == num)
			return true;
		return checksqr(num,++temp);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(new Demo().square(n));
		System.out.println(new Demo().checksqr(n,1));
	}
}
