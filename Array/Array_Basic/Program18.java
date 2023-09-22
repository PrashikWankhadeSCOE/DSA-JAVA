
package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program18 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Enter the sum");
        int sum = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(subarraySum(arr,sum));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        int x = 0;
        int a = -1;
        int b = -1;
        for(int i = 0;i<arr.length;i++){
            x = 0;
            for(int j = i;j<arr.length;j++){
                x += arr[j];
                if(x==sum){
                    a = i;
                    b = j;
                    break;
                }
            }
            if(b!=-1){
                break;
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        if(b==-1)
            al.add(b);
        else{
            al.add(a);
            al.add(b);
        }
        return al;
                
    }
}
