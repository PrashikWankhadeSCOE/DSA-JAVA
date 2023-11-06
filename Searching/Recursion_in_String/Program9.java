// Given two string str1 and str2, return true if str2 is an anagram or str1, and false
// otherwise
// input str1 = "listen" str2 = "silent"
// outpur : true
//
//
import java.util.*;

class Demo{
	boolean anagram(String str1,String str2){
		if(str1.length() !=str2.length())
			return false;
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i = 0;i<arr1.length;i++){
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
	boolean isAnagram(String str1,String str2){	
		if (str1.isEmpty() && str2.isEmpty()) {
			return true;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		int index = str2.indexOf(str1.charAt(0));
		if (index != -1) {
			String temp1 = str1.substring(1);
			String temp2 = str2.substring(0, index) + str2.substring(index + 1);
			return isAnagram(temp1, temp2);
		} 
		else {
			return false;
		}
	}
	public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();
		System.out.println(new Demo().anagram(str1,str2));
        	System.out.println(new Demo().isAnagram(str1,str2));
	}
}
