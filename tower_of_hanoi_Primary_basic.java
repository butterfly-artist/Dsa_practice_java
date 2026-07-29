import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int total=(1<<N)-1;
            System.out.println(total);
            TOH(N,'A','B','C');
        }
    }
    // C destination
    // B is helper
    // a is source
    public static void TOH(int N,char A,char B,char C){
        if(N==0){
            return;
        }
        TOH(N-1,A,C,B);
        System.out.println("Move "+N+" from "+A+" to "+C);
        TOH(N-1,B,A,C);
        
    }
}
