import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program13 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        //System.out.println("times a nonunique no occurs");
        //int x = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(uniqueElement(arr));
    }
    static int uniqueElement(int [] arr){
        int x = 0;
        //int count = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            try{
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                x=arr[i];
            }
            }catch(ArrayIndexOutOfBoundsException ae){

            }
        }
        return x;
    }
}
