/*
 * Problem 2 :
 *
 * Given an array of non-negative integers representing a number, implement a funvtion to simulate
 * the carry forward operation that occurs when adding 1 to the number represented by the array.
 * The array represents the digits of the number. where the 0th index is the least significant digit
 * Your task is to handle the carry forward operation correctly, updating the array accordingly.The 
 * function should return the resulting array.
 *
 * For example, given the input array[1,9,9] representing the number199, the function should 
 * reurn[2,0,0] representing the result adding 1 to 199 with the carry forward property handled 
 *
 * Consider edge cases such as when number has trailing zeros or when the carry forward results in an additional digit.
 * optimize your solution for efficeincy and discuss the time and space complexity of your algorith
 *
 */


import java.util.*;

class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr [] = new int[N];

		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(add1(arr,N));
	}
	static List add1(int arr[],int N){
		LinkedList al = new LinkedList();

		int a = 0;
		for(int i = 0;i<arr.length;i++){
			a = a*10+arr[i];
		}

		a++;

		int temp = a;

		while(temp>0){
			int x = temp%10;
			al.addFirst(x);
			temp = temp/10;
		}

		return al;
	}
}

