package ArrayBasics;

import java.io.*;

public class Program38 {
        public static void main (String [] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the size of array");
            int n = Integer.parseInt(br.readLine());
    
            int arr[] = new int [n];
            
            System.out.println("Enter Elements in array");
            for(int i=0 ;i< arr.length;i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            int [] temp =immediateSmaller(arr);
            for(int i : temp){
                System.out.print(i+" ");
            }
        
    }
    static int[] immediateSmaller(int [] arr){
        int temp [] = arr;
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]>arr[i+1]){
                    temp[i]=arr[i+1];
                }
                else{
                    temp[i]=-1;
                }
            }catch(ArrayIndexOutOfBoundsException ie){
            
            }
        }
        temp[temp.length-1]=-1;
        return temp;
    }
}
