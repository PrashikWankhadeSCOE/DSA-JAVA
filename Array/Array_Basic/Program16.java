import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program16 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string having 0 and 1");
        String str = br.readLine();
        System.out.println(lastIndexofOne(str));
    }
    static int lastIndexofOne(String str){
        int arr[] = new int[str.length()];
        for(int i = 0;i<arr.length;i++){
            arr[i]=str.charAt(i)-0;
        }
        int rem = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='1'-0){
                rem = i;
            }
        }
        return rem;
    }
}
