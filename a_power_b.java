import java.io.*;
import java.util.*;

public class Main {
    public static final int mod= 1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            
            int A=sc.nextInt();
            int B=sc.nextInt();
            long P=A%mod,ans=1;
            if(A==0){
                System.out.println(B==0?1:0);
                continue;
            }
            while(B>0){ 
                if((B&1)==1){
                    ans=(ans*P)%mod;
                }
                P=(P*P)%mod;
                B>>=1;
            }
            System.out.println(ans);
        }
        
    }
}