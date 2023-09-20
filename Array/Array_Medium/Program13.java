package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program11 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(findTriplets(arr1));
    }
    static boolean findTriplets(int arr[]){
        //add code here.
        boolean b = false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(j!=i){
                    for(int k = 0;k<arr.length;k++){
                        if(k!=j && k!=i){
                            //System.out.print(arr[i]+" "+ arr[j]+" "+ arr[k]+ " ");
                            if((arr[i]+arr[j]+arr[k])==0){
                                b = true;
                                break;
                            }
                        }
                    }
                    //System.out.println("");
                    if(b==true)
                        break;
                }
            }
            if(b==true)
                break;
        }
        return b;
        //System.out.println(b);
    }
}
