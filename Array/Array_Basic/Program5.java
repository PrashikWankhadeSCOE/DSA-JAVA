

import java.io.*;

class Replace {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number");
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(replace(N));
    }
    static int replace(int n ){
        int temp = n;
        int len = 0;
        while(temp>0){
            temp/=10;
            len++;
        }
        int arr[] = new int[len];

        temp = n;

        for(int i = 0;i<len;i++){
            arr[len-i-1]=temp%10;
            if(arr[len-i-1]==0){
                arr[len-i-1]=5;
            }
            temp/=10;
        }
        int x = 0;
        for(int i : arr){
            x = x*10 + i;
        }

        return x;
    }
}

