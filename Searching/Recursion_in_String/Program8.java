/// WAP to divide a string into n equal parts, Where string kenngth is multiple of n 
//Example 
//Str : "aaaabbbbcccc"
//n = 3
//output :
//aaaa
//bbbb
//cccc


import java.util.*;

class Demo{
	List divide(String str,int n){
		List list = new ArrayList();
		int c = 0;
		for(int i = 1;i<=n;i++){
			StringBuffer a = new StringBuffer("");
			for(int j = 1;j<=str.length()/n;j++){
				a.append(str.charAt(c));
				c++;
			}	
			list.add(a.toString());
		}
		return list;
	}
	List dividen(String str,int n){
		List list = new ArrayList();
		for(int i = 0;i<str.length()/n;i++){
			list.add(str.substring(i*n,n*(i+1)));
		}
		return list;
	}
	public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                int n = sc.nextInt();
		System.out.println(new Demo().divide(str,n));
		System.out.println(new Demo().dividen(str,n));
        }
}
