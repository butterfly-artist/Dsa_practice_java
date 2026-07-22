import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            int count=0;
            if(N==0){
                System.out.println(N);
            }
            while(N>0){
                long temp=N&1;
                if(temp==1){
                    count++;
                }
                N=N>>1;
            }System.out.println(count);
        }
        
    }
}