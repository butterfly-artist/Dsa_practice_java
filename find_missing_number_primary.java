import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            long sum=0;
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            long resSum=((N+1)*(N+1+1))/2;
            long res=resSum-sum;
            System.out.println(Math.abs(res));
        }
        
    }
}