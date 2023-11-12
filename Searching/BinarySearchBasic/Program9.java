/*
 * You are given a 2D matrix where each row and each column is sorted in ascending
 * order. Write a program to search in a matrix to determine if a target element is
 * present in the matrix.
 *
 * [
 * [1, 4, 7, 11],
 * [2, 5, 8, 12],
 * [3, 6, 9, 16],
 * [10, 13, 14, 17]
 * ]
 * target element 5, the function should return true, as 5 is present in the matrix.
 */

import java.util.*;

class Demo{
	boolean check(int arr[][],int target){
		int row = 0;
		int col = arr.length-1;
		while(row>=0 && col<arr.length){
			if(arr[row][col] == target)
				return true;
			else if(arr[row][col]>target)
				col--;
			else
				row++;
		}
		return false;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		System.out.println(new Demo().check(arr,target));
	}
}
