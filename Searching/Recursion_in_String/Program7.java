//WAP to print the result of removing duplicates from a given string 
//Input - str = HappyNewYear
//Output - HapyNewYr
//
import java.util.*;

class Demo{
	String removeDup(String str){
		char ch [] = str.toCharArray();
		Set set = new LinkedHashSet();
		StringBuffer ret = new StringBuffer("");
		for(int i = 0;i<ch.length;i++){
			set.add(ch[i]);
		}
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			ret.append(itr.next());
		}
		return ret.toString();
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(new Demo().removeDup(str));
	}
}
