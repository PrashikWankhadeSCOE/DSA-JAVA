package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program8 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array");
        int n2 = Integer.parseInt(br.readLine());

        int arr2[] = new int [n2];
        
        System.out.println("Enter Elements in array 2");
        for(int i=0 ;i< arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(missingInSecond(arr1,arr2));
    }
    static ArrayList<Integer> missingInSecond(int arr1[], int arr2[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<arr1.length;i++){
            boolean b = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    b = true;
                    break;
                }
            }
            if(b==false)
                al.add(arr1[i]);
        }
        return al;
    }
}
