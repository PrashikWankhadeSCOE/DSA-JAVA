//WAP to display the first 10 natural number in reverse order 
//

class Demo{
	void natural(int n){
		for(int i=n;i>0;i--){
			System.out.println(i);
		}
	}
	void naturalR(int n){
		
		if(n==0)
			return;
		System.out.println(n);
		naturalR(--n);
	}
	public static void main(String [] args){
		int n = 10;
		new Demo().natural(n);
		new Demo().naturalR(n);
	}
}
