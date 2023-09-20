//not done 
package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program22 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(jump(arr1));
    }
    public static boolean jump(int[] arr) {
        int x = 0;
        boolean b = false;
        for(int i = 0;i<arr.length;){
            if(arr[0]==0 && arr.length==1){
                b = true ;
                break;
            }
            try{
                if(arr[i]==0)
                break;
            }catch(ArrayIndexOutOfBoundsException ae){
            }
            x+=arr[i];
            i+=arr[i];                        
        }
        System.out.println(x);
        if(x>=arr.length-1){
            b = true;
        }
        return b;
    }
}
