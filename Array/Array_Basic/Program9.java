import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter index which no you want too remove");
        int index = Integer.parseInt(br.readLine());

        int [] rr = removeElement(index,arr);
        for(int i : rr){
            System.out.println(i);
        }
    }
    static int[] removeElement(int x,int [] arr){
        int rr[] = new int [arr.length-1];
        int a = 0;
        for(int i = 0;i<arr.length;i++){
            try{
                rr[i-a]=arr[i];
            }catch(ArrayIndexOutOfBoundsException ie){

            }
	    if(i==x){
                a++;
            }
        }
        return rr;
    }
}

