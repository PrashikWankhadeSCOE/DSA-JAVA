//WAp to print the no between 1 to 10
//

class Demo{
	void funFor(int n){
		for(int i = 1;i<=n;i++){
			System.out.println(i);
		}
	}
	void fun(int n ){
		if(n == 0)
			return; 
		fun(--n);
		System.out.println(n+1);
	}
	public static void main(String [] arg){
		int n = 10;
		new Demo().funFor(n);
		new Demo().fun(n);
	}
}
