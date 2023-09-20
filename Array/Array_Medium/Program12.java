package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program12 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no rows");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter no of columns");
        int n2 = Integer.parseInt(br.readLine());

        int arr1[][] = new int [n1][n2];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< n1;i++){
            for(int j = 0;j<n2;j++){
                arr1[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println(rowWithMax1(arr1,n1,n2));
    }

    static int rowWithMax1(int arr[][],int n,int m){
        int x = 0;
        int count = 0;
        int count2 = 0;
        for(int i = 0;i<n;i++){
            count2 =0;
            for(int j = 0;j<m;j++){
                if(arr[i][j]==1){
                    count2++;
                }
            }
            System.out.println(count+ "  "+ i);        
            if(count2>count){
                count=count2;
                x = i;
            }
        }
        return x;
    }
}
