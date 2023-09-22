
package ArrayBasics;

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
        System.out.println("Enter no you want to check");
        int k = Integer.parseInt(br.readLine());

        System.out.println(occurKTimes(k,arr));
    }
    static int occurKTimes(int k,int [] arr){
        int z = -1;
        int diff = Integer.MAX_VALUE;
        int diff2 = 0;
        for(int i = 0;i<arr.length;i++){
            int x = 0;
            for(int j = 0;j<arr.length;j++){
                diff2 = Integer.MAX_VALUE;
                if(arr[i]==arr[j]){
                    x++;
                    if(i>j){
                        diff2 = i;
                    }
                    else
                    diff2 = j;
                }
                //System.out.println(diff2 +" "+i+ " "+ j+" "+ arr[i]);
            }
            if(x==k && diff2<diff){
                z = arr[i];
                diff = diff2;
                //break;
            }
        }
        return z;
    }
}
