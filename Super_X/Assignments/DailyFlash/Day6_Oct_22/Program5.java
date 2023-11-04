//WAP to replace the vowels with # in given string 
//
//input : Meta Data
//output : M#t# D#t#
//
import java.util.*;

class Demo{
	String replace(String str){
		if(str == null || str.length()<=1){
			if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')
				return "#";
			else
				return str;
		}
		if(str.charAt(0) =='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')
                        return '#' + replace(str.substring(1));
		else
			return str.charAt(0) + replace(str.substring(1));

	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(new Demo().replace(str));
	}
}
