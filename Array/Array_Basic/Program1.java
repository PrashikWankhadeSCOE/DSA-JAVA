

import java.io.*;
public class Program1{
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no you want to check");
        int x = Integer.parseInt(br.readLine());

        System.out.println(searchElement(x,arr));
    }
    static int searchElement(int x,int[]arr){
        int y = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                y=i;
            }
        }
        return y;
    }
}

