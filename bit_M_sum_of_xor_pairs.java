import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            long sum=0;
            for(int i=0;i<32;i++){
                long count=0;
                for(int j=0;j<N;j++){
                    if(((arr[j]>>i)&1)==1){
                        count++;
                    }
                }sum+=count*(N-count)*(1L<<i);
            }
            System.out.println(2*sum);
        }
    }
}