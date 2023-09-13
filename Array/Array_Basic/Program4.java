import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Product {
     public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(product(arr));
    }
    static int product(int[]arr){
        int pro= 1;
            for(int x : arr){
                pro *= x;
            }
        return pro;
    }
}


