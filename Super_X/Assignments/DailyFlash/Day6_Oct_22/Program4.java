//WAP to print strong numbers in a given range
//
import java.util.*;

class Demo{
	void strongInrange(int s,int e){
		for(int i = s;i<=e;i++){
			int sum = 0;
			int temp = i;
			while(temp>0){
				int rem = temp%10;
				int fact = 1;
				while(rem>0){
					fact = fact*rem;
					rem--;
				}
				temp = temp/10;
				sum = sum+fact;
			}
			//System.out.println(sum);
			if(sum == i)
				System.out.println(sum);
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		new Demo().strongInrange(s,e);
	}
}
