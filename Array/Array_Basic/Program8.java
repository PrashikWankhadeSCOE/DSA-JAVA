//Not Done

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program8 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(evenOccuring(arr));
    }
    static List<Integer> evenOccuring(int[] arr){
        List<Integer> al = new ArrayList<Integer>();
 	Array.sort(arr);
	int count = 1;
	int x = 0;
	for(int i=0;i<arr.length;i++){
		
	}
        return al;
    }
}

