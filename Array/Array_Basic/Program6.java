import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program6 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter no you want to check ");
        int from = Integer.parseInt(br.readLine());
        int to = Integer.parseInt(br.readLine());

        System.out.println(inRange(from,to,arr));
    }
    static boolean inRange(int from,int to,int[]arr){
        boolean x = false;
        int c = 0;
        for(int i : arr){
            if(from==i || to == i){
                c++;
            }

        }
        if(c == 2){
            x = true;
        }
        return x;
    }

}

