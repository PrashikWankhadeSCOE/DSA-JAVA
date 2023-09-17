package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        /*int [] rr = dupInArr(arr);
        for(int i : rr){
            System.out.println(i);
        }*/
        System.out.println(dupInArr(arr));
    }
    static List <Integer> dupInArr(int [] arr){
        List <Integer> al = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]==arr[i+1]){
                    al.add(arr[i]);
                }
            }catch(ArrayIndexOutOfBoundsException ie){
                
            }
        }
        return al;
    }
}
