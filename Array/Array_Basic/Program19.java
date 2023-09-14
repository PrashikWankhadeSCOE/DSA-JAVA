package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program19 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array 1");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array 1");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the size of array 2");
        int n2 = Integer.parseInt(br.readLine());

        int arr2[] = new int [n2];
        
        System.out.println("Enter Elements in array 2");
        for(int i=0 ;i< arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array 3");
        int n3 = Integer.parseInt(br.readLine());

        int arr3[] = new int [n3];
        
        System.out.println("Enter Elements in array 3");
        for(int i=0 ;i< arr3.length;i++){
            arr3[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(commonElem(arr1,arr2,arr3));
    }
    static List<Integer> commonElem(int arr1[],int arr2[],int [] arr3){
        List <Integer> al = new ArrayList<Integer>();
        int x = 0;
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    x=arr1[i];
                    break;
                }
            }
            for(int j = 0;j<arr3.length;j++){
                if(x==arr3[j]){
                    al.add(x);
                    break;
                }
            }
        }
        return al;
    }
}
