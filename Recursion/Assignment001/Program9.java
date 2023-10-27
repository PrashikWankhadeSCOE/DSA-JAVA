//WAP to print string in reverse order 
//

import java.util.*;

class Demo{
	int i = 0;
	void rev(String str){
		if(i==str.length())
			return;
		i++;
		rev(str);
		i--;
		System.out.print(str.charAt(i));
	}
	void reverse(String str){
	
		for(int i = str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		new Demo().reverse(str);
		new Demo().rev(str);
	}
}
