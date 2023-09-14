import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Program15 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(sumofDistinct(arr));
    }
    static int sumofDistinct(int [] arr){
        Set<Integer> ss = new TreeSet<Integer>();
        for(int i = 0;i<arr.length;i++){
            ss.add(arr[i]);
        }
        int sum = 0;
        Iterator<Integer> itr = ss.iterator();
        while(itr.hasNext()){
            sum+=itr.next();
        }
        return sum;
    }
}
