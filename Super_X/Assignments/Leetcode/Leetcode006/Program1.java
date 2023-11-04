/* 
 * 
 * Day-6
 * 
 * Capitalize the Title (Leetcode-2129)
 * 
 * You are given a string title consisting of one or more words separated by a
 * single space, where each word consists of English letters. Capitalize the
 * string by changing the capitalization of each word such that:
 * 
 * If the length of the word is 1 or 2 letters, change all letters to lowercase.
 * 
 * Otherwise, change the first letter to uppercase and the remaining letters to
 * lowercase.
 * 
 * Return the capitalized title.
 * 
 * Example 1:
 * 
 * Input: title = "capiTalIze tHe titLe"
 * Output: "Capitalize The Title"
 * Explanation:
 * Since all the words have a length of at least 3, the first letter of each word
 * is uppercase, and the remaining letters are lowercase.
 * 
 * Example 2:
 * 
 * Input: title = "First leTTeR of EACH Word"
 * Output: "First Letter of Each Word"
 * Explanation:
 * The word "of" has length 2, so it is all lowercase.
 * The remaining words have a length of at least 3, so the first letter of each
 * remaining word is uppercase, and the remaining letters are lowercase.
 * 
 * Example 3:
 * 
 * Input: title = "i lOve core2web"
 * Output: "i Love Core2web"
 * Explanation:
 * The word "i" has length 1, so it is lowercase.
 * The remaining words have a length of at least 3, so the first letter of each
 * remaining word is uppercase, and the remaining letters are lowercase.
 * 
 * Constraints:
 * 1 <= title.length <= 100
 * 
 * title consists of words separated by a single space without any leading or trailing spaces.
 * 
 * Each word consists of uppercase and lowercase English letters and is non-empty.
 */

import java.util.*;

class Demo{
	static String capitalizeTitle(String title) {
        String words[] = title.split(" ");

        StringBuffer sb = new StringBuffer("");

        for(int i = 0;i<words.length;i++){

            String str = words[i];

            if(str.length() <=2 ){
                for(int j = 0;j<str.length();j++){
                    if(Character.isUpperCase(str.charAt(j))){
                        sb.append(Character.toLowerCase(str.charAt(j)));
                    }
                    else{
                        sb.append(str.charAt(j));
                    }
                }
            }

            else{
                if(Character.isLowerCase(str.charAt(0))){
                    sb.append(Character.toUpperCase(str.charAt(0)));
                }
                else{
                    sb.append(str.charAt(0));
                }
                for(int j = 1;j<str.length();j++){
                    if(Character.isUpperCase(str.charAt(j))){
                        sb.append(Character.toLowerCase(str.charAt(j)));
                    }
                    else{
                        sb.append(str.charAt(j));
                    }
                }
            }
            if(i==words.length-1)
            break;
            sb.append(" ");
        }
        return String.valueOf(sb);
    }
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);

	String str = sc.nextLine();

	System.out.println(capitalizeTitle(str));

    }
}
