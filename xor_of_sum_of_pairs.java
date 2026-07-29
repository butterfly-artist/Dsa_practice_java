import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            int ans=0;
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                ans=ans^(arr[i]+arr[i]);
            }
            System.out.println(ans);
        }
    }
}