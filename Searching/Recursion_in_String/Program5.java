// WAP to check whether a given string is palindrome string or not 


import java.util.*;

class Demo{
        String palindrome(String str){
		if(str == null || str.length()<=1)
			return str;
		return palindrome(str.substring(1)) + str.charAt(0);
        }
        public static void main(String [] arggs){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                String ret = new Demo().palindrome(str);
		
		if(ret.equals(str))
			System.out.println("string is palindrome");
		else
			System.out.println("String is not palindrome");
        }
}
