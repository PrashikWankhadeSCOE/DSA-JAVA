/*
 * WAP to find the occurance of vowels in a given string
 * input : core2web
 * output : 
 * a=0
 * e=2
 * i=0
 * o=1
 * u=0
 */

import java.io.*;
import java.util.*;

class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		System.out.println(countOfVowels(str));
	}
	static Map countOfVowels(String str){
		Map map = new LinkedHashMap();
		
		int a = 0;
		int e = 0;
		int I = 0;
		int o = 0;
		int u = 0;

		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='A')
				a++;
			if(str.charAt(i)=='e' || str.charAt(i)=='E')
				e++;
			if(str.charAt(i)=='i' || str.charAt(i)=='I')
				I++;
			if(str.charAt(i)=='O' || str.charAt(i)=='o')
				o++;
			if(str.charAt(i)=='U' || str.charAt(i)=='u')
				u++;
		}
		map.put('a',a);
		map.put('e',e);
		map.put('i',I);
		map.put('o',o);
		map.put('u',u);
		return map;
	}
}

