import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            if(N>0&&(N&(N-1))==0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        
    }
}