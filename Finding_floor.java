import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int Q=sc.nextInt();
        while(Q-->0){
            int K=sc.nextInt();
            int ans=Integer.MIN_VALUE; 
            int l=0,h=N-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(arr[mid]<=K){
                    ans=arr[mid];
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }System.out.println(ans);
        }
    }
}