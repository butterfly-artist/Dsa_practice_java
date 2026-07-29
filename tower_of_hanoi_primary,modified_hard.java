import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int total=(int)Math.pow(3,N)-1;
            System.out.println(total);
            TOH(N,'A','B','C');
        }
    }
    public static void TOH(int N,char A,char B,char C){
        if(N==0){
            return;
        }
        TOH(N-1,A,B,C);
        System.out.println("Move "+N+" from "+A+" to "+B);
        TOH(N-1,C,B,A);
        System.out.println("Move "+N+" from "+B+" to "+C);
        TOH(N-1,A,B,C);
        
    }
}