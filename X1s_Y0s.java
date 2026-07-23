import java.io.*;
import java.util.*;

public class Main {
    public static final int mod=1000000007;
    public static long power(int A,int B){
        long P=A%mod,ans=1;
        if(A==0){
                 return (B==0?1:0);   
        }
        while(B>0){ 
                if((B&1)==1){
                    ans=(ans*P)%mod;
                }
                P=(P*P)%mod;
                B>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(N==0){
                System.out.println(N);
                continue;
            }
            long part1=(power(2,N+M)-1+mod)%mod;
            long part2=(power(2,M)-1+mod)%mod;
            long res= ((part1%mod )-(part2%mod) +mod)%mod;
            System.out.println(res);
        }
        
    }
}