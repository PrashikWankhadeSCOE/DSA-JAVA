
package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javafx.util.Pair;

public class Program24 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Floor No");
        int x = Integer.parseInt(br.readLine());

        System.out.println(ceilingFloor(arr,x));
    }
    static Pair<Integer,Integer> ceilingFloor(int[] arr, int x) {
        // code here
        int ceil = Integer.MAX_VALUE;
        int floor = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=x && arr[i]<ceil){
                ceil = arr[i];
            }
            if(arr[i]<=x && arr[i]>floor){
                floor = arr[i];
            }
        }
        if(ceil==Integer.MAX_VALUE)
        ceil = -1;
        Pair<Integer,Integer> pair = new Pair<>(floor,ceil);
        return pair;
    }
}
