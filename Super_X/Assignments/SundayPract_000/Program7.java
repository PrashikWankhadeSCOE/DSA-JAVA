/*
 * Take the sizre of array form user and create two arrays of same size .
 * Initialize all seconf array element as zero 
 * for first array take all elements form user
 * check if the element in first array are even or not if its even then the replace the value of second array of that
 * with 1 and print both the array 
 * input size : 10;
 * Array1 = 4 2 3 6 8 7 1 0 9 5
 * Output:
 * Array1 = 4 2 3 6 8 7 1 0 9 5
 * Array2 = 1 1 0 1 1 0 0 1 0 0
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1 []= new int [size];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();
		}

		int arr2 []= new int[size];

		arr2 = evenNo(arr1,arr2);
		for(int i : arr1){
			System.out.print(i);
		}
		System.out.println("");
		for(int i : arr2){
			System.out.print(i);
		}
		System.out.println("");
	}
	static int[] evenNo(int arr1[],int arr2[]){
		for(int i = 0;i<arr1.length;i++){
			if(arr1[i]%2==0)
				arr2[i]=1;
		}
		return arr2;
	}
}

