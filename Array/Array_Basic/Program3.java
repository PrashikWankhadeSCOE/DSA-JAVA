import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LargestElement{
     public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int max = Integer.MIN_VALUE;
            for(int x : arr){
                if(x>max)
                max = x;
            }
        return max;
    }
}

