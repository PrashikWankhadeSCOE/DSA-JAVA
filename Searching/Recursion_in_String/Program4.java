/*
 * WAP to convert all character in the array lowercase
 */

import java.util.*;

class Demo{
        String replace(String str){
                if(str==null || str.length()<=1){
                        if(str.charAt(0)>='A' && str.charAt(0)<='Z')
                                return String.valueOf((char)(str.charAt(0)+32));
                        else
                                return str;
                }
                if(str.charAt(0)>='A' && str.charAt(0)<='Z')
                        return ((char)(str.charAt(0)+32)) + replace(str.substring(1));
                else
                        return str.charAt(0) + replace(str.substring(1));
        }
        public static void main(String [] arggs){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                System.out.println(new Demo().replace(str));
        }
}
