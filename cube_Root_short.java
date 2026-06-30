import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            long N=sc.nextLong();
            long res=Math.round(Math.cbrt(N));
            System.out.println(res);
        }
    }
}