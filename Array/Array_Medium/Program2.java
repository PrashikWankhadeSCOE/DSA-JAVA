package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(pythagoreanTriplet(arr));
    }
    static boolean pythagoreanTriplet(int [] arr){
        boolean r = false; 
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int l = 0;l<arr.length;l++){
                    if(arr[i]*arr[i] + arr[j]*arr[j] == arr[l]*arr[l]){
                        //System.out.println(arr[i] +" "+arr[j] + " "+ arr[l]);
                        r = true;
                        break;
                    }
                }
                if(r==true){
                    break;
                }
            }
            if(r==true)
                break;
        }
        return r;
    }
}
