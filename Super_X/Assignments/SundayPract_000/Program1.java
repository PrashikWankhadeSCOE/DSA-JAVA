/*
 * Que 1 
 * WAP to print the factorial of the even number in given number
 * Input :
 * 256946
 * Output :
 * 2,720,24,720
*/

import java.util.*;


class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List al = fact(num);
		System.out.println(al);
	}
	static List fact(int num){
		List al = new ArrayList();
		String str = String.valueOf(num);
		int arr[] = new int[str.length()];
		for(int i = 0;i<arr.length;i++){
			arr[i]=(int)(str.charAt(i)-'0');
			int fact = 1;
			if(arr[i]%2==0){
				int temp = arr[i];
				while(temp>0){
					fact = fact*temp;
					temp--;
				}
				al.add(fact);
			}	
		}
		return al;
	}
}

