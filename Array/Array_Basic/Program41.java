package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program41 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int A[] = new int [n];
        
        System.out.println("Enter Elements in array 1");
        for(int i=0 ;i< n;i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        int B[] = new int [n];
        
        System.out.println("Enter Elements in array 2");
        for(int i=0 ;i< n;i++){
            B[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(countWar(A,B));
    }
    static String countWar(int [] A,int [] B){
        int countA = 0;
        int countB = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>B[i]){
                countA++;
            }
            else if(A[i]<B[i]){
                countB++;
            }
            else{

            }
        }
        if(countA>countB)
        return "A";
        else if(countB>countA)
        return "B";
        else
        return "DRAW";
    }
}
