import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            if(N==0){
                System.out.println(N);
            }
            while(N>0){
            sb.append(N&1);
            N=N>>1;
            }System.out.println(sb.reverse());
        }
        
    }
}