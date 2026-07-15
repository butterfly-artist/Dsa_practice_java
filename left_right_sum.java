import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int[] prefix=new int[N+1];
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            prefix[i+1]=prefix[i]+arr[i];
        }
        for(int i=0;i<N;i++){
          int leftsum= prefix[i];
           int rightsum=prefix[N]-prefix[i+1];
            System.out.print(Math.abs(leftsum-rightsum)+" ");
      }
        
        
    }
}