
package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program14 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        System.out.println("k=0 to k=n-1");
        int k = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(maxRepeat(arr,k));
    }
    static int maxRepeat(int [] arr,int k){
        int x = 0;
        int y = -1;
        for(int i = 0;i<arr.length;i++){
            int x2 = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    x2++;
                }
                //System.out.println(x+ " "+ x2+ " "+ arr[i]);
                if(x2>x || (x2==x && arr[i]<y)){
                    x=x2;
                    y = arr[i];
                }
            }
        }
        return y;
    }
}
