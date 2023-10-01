/*
 * QUE 2 :
 * WAP to find wheather the entered number is armstring or not 
 * Inptut : 153 
 * Output : True 
*/

import java.io.*;

class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(armstrongNo(num));
	}
	static boolean armstrongNo(int num){
		String str = String.valueOf(num);
		int len = str.length();
		int temp = num;
		int rev = 0;
		while(temp>0){
			int x = temp%10;
			int z = x;
			for(int i = 1;i<len;i++){
				z = z*x;
			}
			rev = rev+z;
			temp=temp/10;
		}
		if(num==rev)
			return true;
		return false;
	}
}
