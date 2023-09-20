package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program20 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(majorityEle(arr1));
    }
    static int majorityEle(int arr[]){
        int maj = -1;
        for(int i = 0;i<arr.length;i++){
            int n = arr[i];
            int c = 0;
            for(int j = 0;j<arr.length;j++){
                if(n == arr[j]){
                    c++;
                }
            }
            if(c>arr.length/2){
                maj = n;
                break;
            }
        }
        return maj;
    }
}
