package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program29 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String str = br.readLine();

        System.out.println(lastIndex(str));
    }
    static int lastIndex(String str){
        int arr[] = new int[str.length()];
        int x = -1;
        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i)-'0';
            if(arr[i]==1){
                x=i;
            }
        }
        return x;
    }
}
