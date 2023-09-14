import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program7 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(largestNum(arr));
    }
    static int largestNum(int [] arr){
        int x = 0;
        Arrays.sort(arr);
	int rr[] = new int[arr.length];
	for(int i=0;i<rr.length;i++){
		rr[i]=arr[arr.length-i-1];
	}
	for(int i : rr){
		x=x*10+i;
	}
        return x;
    }
}

