/*
 * WAP to return a number and put successive number sum into an array and print it
 * input : 45689
 * Output : 17 14 11 9 4
 */

import java.util.*;

class Demo{
        public static void main(String []a ){
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();

                int arr[] = sum(x);

                for(int i : arr){
                        System.out.println(i);
                }
        }
	static int[] sum(int x){
		String str = String.valueOf(x);
		int arr [] = new int[str.length()];
		for(int i = 0;i<arr.length;i++){
			arr[i] = str.charAt(arr.length-i-1) - '0';
		}
		int arr2[] = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			try{
				arr2[i] = arr[i] + arr[i+1];
			}catch(ArrayIndexOutOfBoundsException ie){
				arr2[i] = arr[i];
			}
		}
		return arr2;
	}
}

