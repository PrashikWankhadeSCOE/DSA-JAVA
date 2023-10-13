package ArrayBasics;

import java.io.*;

public class Program26 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = posNeg(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static int [] posNeg(int [] arr){
        int pos[] = new int[arr.length/2+1];
        int neg [] = new int[arr.length/2+1];
        
        int p = 0;
        int n = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                pos[p]=arr[i];
                p++;
            }
            else {
                neg[n]=arr[i];
                n++;
            }
        }
        
        n= 0;
        p= 0;

        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                arr[i]= pos[p];
                p++;
            }
            else{
                arr[i] = neg[n];
                n++;
            }
        }
        return arr;
    }
}
