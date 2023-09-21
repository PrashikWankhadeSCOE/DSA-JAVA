package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program28 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        int rr [] =findTwoElement(arr1);
        for(int i :rr)
        System.out.println(i);
    }
    static int[] findTwoElement(int arr[]) {

        int x = 1;
        int m = 0;
        for(int i = 0;i<arr.length;i++){
            if(m==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        m=arr[i];
                    }
                }
            }
            if(arr[i]==x || arr[0]==x){
                x++;
                i=0;
            }
        }
        int rr [] = {m,x};
        return rr;
    }
}
