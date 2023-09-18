package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program21 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(firstNonRepeating(arr));
    }
    
    static int firstNonRepeating(int arr[]) { 
        int x = 0;
        for(int i = 0;i<arr.length;i++){
        int count =0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                if(i==j)
                    count++;
                else
                    break;
            }
            else
                count++;
        }
        if(count>=arr.length){
            x=arr[i];
            break;            
        }
        }
        return x;
    }  
}
